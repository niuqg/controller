package edu.ustc.qos.statusmanager;

import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;

import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.NodeKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.GetAllMeterStatisticsInputBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.GetAllMeterStatisticsOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.OpendaylightMeterStatisticsService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;
import org.opendaylight.controller.sal.core.Description;
import org.opendaylight.controller.sal.core.Host;
import org.opendaylight.controller.sal.core.Node;
import org.opendaylight.controller.switchmanager.ISwitchManager;
import org.opendaylight.controller.statisticsmanager.IStatisticsManager;
import org.opendaylight.controller.switchmanager.Switch;
import org.opendaylight.controller.sal.core.NodeConnector;
import org.opendaylight.controller.sal.packet.address.EthernetAddress;
import org.opendaylight.controller.sal.reader.FlowOnNode;
import org.opendaylight.controller.sal.reader.NodeConnectorStatistics;
import org.opendaylight.controller.sal.reader.NodeDescription;
import org.opendaylight.controller.topologymanager.ITopologyManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.ustc.qos.dao.Host_Info_Dao;
import edu.ustc.qos.dao.Switch_Info_Dao;
import edu.ustc.qos.dao.Entry_Stat_Dao;
import edu.ustc.qos.dao.Port_Stat_Dao;
import edu.ustc.qos.databasemanager.Entry_Stat;
import edu.ustc.qos.databasemanager.Host_Info;
import edu.ustc.qos.databasemanager.Port_Stat;
import edu.ustc.qos.databasemanager.Switch_Info;

import java.util.Timer;

/**
 * Hello world!
 * 
 */
public class statusmanager implements CommandProvider {
    private ISwitchManager switchManager;
    private IStatisticsManager statisticsManager;
    private ITopologyManager topologyManager;
    private Timer timer = new Timer();
    private OpendaylightMeterStatisticsService meterStatsService;
    private List<Switch> switchList = null;
    private ConcurrentMap<Node, List<NodeConnectorStatistics>> nodeConnectorStatistics;
    private ConcurrentMap<Node, List<FlowOnNode>> flowOnNodeMap; // ####二选一
    private ConcurrentMap<Switch, NodeDescription> nodeDes;// *
    private ConcurrentMap<NodeConnector, List<Host>> host;// *
    private ConcurrentMap<NodeConnector, NodeConnectorStatistics> old;
    private Entry_Stat EntryData;
    private Switch_Info swInfo;
    private Port_Stat PortData;
    private Host_Info hInfo;
    private NodeKey targetNodeKey;
    private InstanceIdentifier<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node> targetNodeIdentifier;
    private Switch_Info_Dao swInfoDao;
    private Entry_Stat_Dao EntryDao;
    private Port_Stat_Dao PortDao;
    private Host_Info_Dao hInfoDao;
    private static Logger log = LoggerFactory.getLogger(statusmanager.class);
    private int count = 0; // 扫描计数
    private int scantime = 5; // 计算速率计数
    Future<RpcResult<GetAllMeterStatisticsOutput>> meterFuture;
    private NodeRef targetNodeRef;

    public void startScan() {
        getDataFromController();
        addInfoToDatabase();
        addDataToDatabase();
    }

    public void stopScan() {
        timer.cancel();
    }

    private void getDataFromController() {
        // System.out.println("\nI am in getDataFromController()");
        switchList = (this.switchManager == null) ? null : this.switchManager
                .getNetworkDevices();
        if (this.statisticsManager != null && switchList != null) {
            Node node = null;
            for (Switch sw : switchList) {
                try {
                    node = sw.getNode();
                    if (meterStatsService != null) {
                        targetNodeKey = new NodeKey((NodeId) node.getID());
                        /*
                         * this.targetNodeIdentifier = InstanceIdentifier
                         * .builder(Nodes.class) .child(Node.class,
                         * targetNodeKey).build();
                         */
                        this.targetNodeIdentifier = InstanceIdentifier
                                .builder(
                                        org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes.class)
                                .child(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node.class,
                                        targetNodeKey).build();
                        this.targetNodeRef = new NodeRef(targetNodeIdentifier);
                        GetAllMeterStatisticsInputBuilder input = new GetAllMeterStatisticsInputBuilder();
                        input.setNode(targetNodeRef);
                        meterFuture = meterStatsService
                                .getAllMeterStatistics(input.build());
                        List<MeterStats> meterList=meterFuture.get().getResult().getMeterStats();
                        System.out.println("************************************************************");
                        for(MeterStats m:meterList)
                            System.out.println("meterID is:"+m.getMeterId()+"PacketInCount is :"+m.getPacketInCount());
                        System.out.println("************************************************************");

                    }
                    nodeConnectorStatistics.put(node,
                            statisticsManager.getNodeConnectorStatistics(node));
                    flowOnNodeMap.put(node, statisticsManager.getFlows(node));
                    NodeDescription descrip = statisticsManager
                            .getNodeDescription(node);
                    if (descrip != null)
                        nodeDes.put(sw, descrip);// SW_Info
                    for (NodeConnector nConnector : sw.getNodeConnectors()) {
                        if (topologyManager != null
                                && topologyManager
                                        .getHostsAttachedToNodeConnector(nConnector) != null) {
                            List<Host> h = topologyManager
                                    .getHostsAttachedToNodeConnector(nConnector);
                            // 主机和NodeConnector映射
                            host.put(nConnector, h);// Host_Info
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Wait........");
                }
            }
        }
    }

    // Host_Info and SW_Info
    private void addInfoToDatabase() {
        NodeDescription node;
        for (Entry<Switch, NodeDescription> sw : nodeDes.entrySet()) {
            node = sw.getValue();
            swInfo.setHardware(node.getHardware());
            swInfo.setSoftware(node.getSoftware());
            swInfo.setManufacture(node.getManufacturer());
            Description description = (Description) switchManager.getNodeProp(
                    sw.getKey().getNode(), Description.propertyName);
            String desc = (description == null) ? "" : description.getValue();
            swInfo.setSwitch_Name(desc);
            swInfo.setDatapath_ID((long) sw.getKey().getNode().getID());
            try {
                if (swInfoDao.getSwitchById((int) swInfo.getDatapath_ID()) != null) {
                    swInfoDao.modSwitchById((int) swInfo.getDatapath_ID(),
                            swInfo);
                } else {
                    swInfoDao.addSwitchData(swInfo);
                }
            } catch (Exception e) {
                System.out.println("\nFailed to Add Info \n");
                timer.cancel();
            }
        }
        for (Entry<NodeConnector, List<Host>> ht : host.entrySet()) {
            for (Host htvalue : ht.getValue()) {
                NodeConnector htkey = ht.getKey();
                hInfo.setIPv4_Addr(htvalue.getNetworkAddressAsString());
                EthernetAddress eth = (EthernetAddress) htvalue
                        .getDataLayerAddress();
                hInfo.setHost_MAC(eth.getMacAddress());
                hInfo.setHost_Name(htvalue.getNetworkAddress().getHostName());
                hInfo.setPort_ID((short) htkey.getID());
                hInfo.setDatapath_ID((long) htkey.getNode().getID());
                try {
                    if (hInfoDao.getHostByName(hInfo.getHost_Name()) != null)
                        hInfoDao.modHostInfoByName(hInfo.getHost_Name(), hInfo);
                    else {
                        hInfoDao.addHostInfo(hInfo);
                    }
                } catch (Exception e) {
                    System.out.println("\nFailed to Add Info \n");
                    timer.cancel();
                }
            }
        }
    }

    private void addDataToDatabase() {
        for (Entry<Node, List<NodeConnectorStatistics>> entry : nodeConnectorStatistics
                .entrySet()) {
            for (NodeConnectorStatistics ncs : entry.getValue()) {
                NodeConnector co = ncs.getNodeConnector();
                PortData.setDatapath_ID((long) entry.getKey().getID());
                PortData.setPort_ID((short) co.getID());
                PortData.setRecv_Pkt_Error(ncs.getReceiveErrorCount());
                PortData.setRecv_Pkt_Loss(ncs.getReceiveDropCount());
                PortData.setTrans_Pkt_Error(ncs.getTransmitErrorCount());
                PortData.setTrans_Pkt_Loss(ncs.getTransmitDropCount());
                try {
                    PortDao.addPort_Stat(PortData);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("\nFailed to Add Data \n");
                    timer.cancel();
                }
            }
        }
        for (Entry<Node, List<FlowOnNode>> flowE : flowOnNodeMap.entrySet()) {
            Node node = flowE.getKey();
            List<FlowOnNode> list = flowE.getValue();
            for (FlowOnNode f : list) {
                EntryData.setByte_Num(f.getByteCount());
                EntryData.setPkt_Num(f.getPacketCount());
                EntryData.setEntry_ID(f.getFlow().getId());
                EntryData.setTable_ID(f.getTableId());
                EntryData.setEntry_Duration(f.getDurationSeconds());
                EntryData.setDatapath_ID((long) node.getID());
                try {
                    EntryDao.addEntry_Stat(EntryData);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    public void setSwitchManagerService(ISwitchManager switchManager) {
        log.trace("Got switch  manager set request {}", switchManager);
        this.switchManager = switchManager;
        if (switchManager != null)
            System.out.println("\nI am in setSwitchManagerService");
    }

    public void unsetSwitchManagerService(ISwitchManager switchManager) {
        log.trace("Got switch manager UNset request");
        this.switchManager = null;
        System.out.println("\nI am in unsetSwitchManagerService");
    }

    public void setStatisticsManagerService(IStatisticsManager statisticsManager) {
        log.trace("Got switch  manager set request {}", statisticsManager);
        this.statisticsManager = statisticsManager;
        System.out.println("\nI am in setStatisticsManagerService");
    }

    public void unsetStatisticsManagerService(
            IStatisticsManager statisticsManager) {
        log.trace("Got switch  manager UNset request ");
        this.statisticsManager = null;
        System.out.println("\nI am in unsetStatisticsManagerService");

    }

    public void setOpendaylightMeterStatisticsService(
            OpendaylightMeterStatisticsService meterStatsService) {
        log.trace("Got meterStatsService set request{}");
        this.meterStatsService = meterStatsService;
    }

    public void unsetOpendaylightMeterStatisticsService() {
        log.trace("Got meterStatsService unset request{}");
        this.meterStatsService = null;
    }

    public void setTopologyManagerService(ITopologyManager topo) {
        log.trace("Got switch  manager set request {}", topo);
        this.topologyManager = topo;
        System.out.println("\nI am in setTopologyManagerService");
    }

    public void unsetTopologyManagerService(ITopologyManager topo) {
        log.trace("Got topology  manager UNset request ");
        this.topologyManager = null;
        System.out.println("\nI am in unsetTopologyManagerService");
    }

    public void start() {
        System.out.println("\n\nScan The Net\n\n");
        myAllocation();
        timer.schedule(new MyTask(), 2000, scantime * 1000);
    }

    public void stop() {
        timer.cancel();
        myRecover();
    }

    public void myAllocation() {
        flowOnNodeMap = new ConcurrentHashMap<Node, List<FlowOnNode>>();
        nodeConnectorStatistics = new ConcurrentHashMap<Node, List<NodeConnectorStatistics>>();
        nodeDes = new ConcurrentHashMap<Switch, NodeDescription>();
        host = new ConcurrentHashMap<NodeConnector, List<Host>>();
        old = new ConcurrentHashMap<NodeConnector, NodeConnectorStatistics>();
        PortData = new Port_Stat();
        swInfo = new Switch_Info();
        EntryData = new Entry_Stat();
        hInfo = new Host_Info();
        swInfoDao = new Switch_Info_Dao();
        PortDao = new Port_Stat_Dao();
        EntryDao = new Entry_Stat_Dao();
        hInfoDao = new Host_Info_Dao();
    }

    public void myRecover() {
        switchList.clear();
        nodeConnectorStatistics.clear();
        flowOnNodeMap.clear(); // ####二选一
        nodeDes.clear();
        host.clear();
        old.clear();
    }

    public class MyTask extends java.util.TimerTask {
        @Override
        public void run() {
            System.out.print("\n\nMyTask::" + count + "::Strats.");
            startScan();
            if (count % 60 == 0) {
                try {
                    int oldTime = 28800;
                    PortDao.deleteOld(oldTime);
                    EntryDao.deleteOld(oldTime);
                    hInfoDao.deleteAllHost();
                    swInfoDao.deleteAllSwitch();
                } catch (Exception e) {
                    System.out.println("Delete Old Data Failed ");
                }
            }
            System.out.print("....Ends.");
            count++;
        }
    }

    @Override
    public String getHelp() {
        // TODO Auto-generated method stub
        return null;
    }

    public void _startscan(CommandInterpreter ci) {
        start();
    }

    public void _stopscan(CommandInterpreter ci) {
        System.out.println("Stop Scan net");
        stop();
    }
}
