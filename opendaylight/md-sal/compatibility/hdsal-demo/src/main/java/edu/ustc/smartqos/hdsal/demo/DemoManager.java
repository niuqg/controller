package edu.ustc.smartqos.hdsal.demo;

import java.util.List;
import java.util.Timer;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.opendaylight.controller.sal.binding.api.data.DataBrokerService;
import org.opendaylight.controller.sal.core.Description;
import org.opendaylight.controller.sal.core.Host;
import org.opendaylight.controller.sal.core.Node;
import org.opendaylight.controller.sal.core.NodeConnector;
import org.opendaylight.controller.sal.core.Node.NodeIDType;
import org.opendaylight.controller.sal.packet.address.EthernetAddress;
import org.opendaylight.controller.sal.reader.FlowOnNode;
import org.opendaylight.controller.sal.reader.NodeConnectorStatistics;
import org.opendaylight.controller.sal.reader.NodeDescription;
import org.opendaylight.controller.statisticsmanager.IStatisticsManager;
import org.opendaylight.controller.switchmanager.ISwitchManager;
import org.opendaylight.controller.switchmanager.Switch;
import org.opendaylight.controller.topologymanager.ITopologyManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.ustc.qos.dao.Entry_Stat_Dao;
import edu.ustc.qos.dao.Host_Info_Dao;
import edu.ustc.qos.dao.Port_Stat_Dao;
import edu.ustc.qos.dao.Switch_Info_Dao;
import edu.ustc.qos.databasemanager.Entry_Stat;
import edu.ustc.qos.databasemanager.Host_Info;
import edu.ustc.qos.databasemanager.Port_Stat;
import edu.ustc.qos.databasemanager.Switch_Info;

public class DemoManager {
    private ISwitchManager switchManager;
    private IStatisticsManager statisticsManager;
    private ITopologyManager topologyManager;
    public DataBrokerService dataService;
    private Timer timer = new Timer();

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

    private Switch_Info_Dao swInfoDao;
    private Entry_Stat_Dao EntryDao;
    private Port_Stat_Dao PortDao;
    private Host_Info_Dao hInfoDao;
    private static Logger log = LoggerFactory.getLogger(DemoManager.class);
    private int count = 0; // 扫描计数
    private int scantime = 15; // 计算速率计数
    
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
    private void addInfoToDatabase() {
        NodeDescription node;
        for (Entry<Switch, NodeDescription> sw : nodeDes.entrySet()) {
            node = sw.getValue();
            System.out.println(sw.getKey()+"*****"+sw.getValue());
            swInfo.setHardware(node.getHardware());
            swInfo.setSoftware(node.getSoftware());
            swInfo.setManufacture(node.getManufacturer());
            Description description = (Description) switchManager.getNodeProp(
                    sw.getKey().getNode(), Description.propertyName);
            String desc = (description == null) ? "" : description.getValue();
            swInfo.setSwitch_Name(desc);
            swInfo.setActive_State(1);
            swInfo.setSerial_Number(sw.getValue().getSerialNumber());
            swInfo.setDatapath_ID(sw.getKey().getNode().getID().toString());
            try {
                if (swInfoDao.getSwitchById( swInfo.getDatapath_ID()) != null) {
                     swInfoDao.modSwitchById(swInfo.getDatapath_ID(),swInfo);
                     System.out.println("*******mod******");
                } else {
                    swInfoDao.addSwitchData(swInfo);
                    System.out.println("**********add***********");
                }
            } catch (Exception e) {
            	e.printStackTrace();
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
                PortData.setDatapath_ID(entry.getKey().getID().toString());
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
                EntryData.setDatapath_ID( node.getID().toString());
                try {
                    EntryDao.addEntry_Stat(EntryData);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
    public ISwitchManager getSwitchManager(){
        return switchManager;
    }
    
    public void setSwitchManager(ISwitchManager switchManager) {
        this.switchManager = switchManager;
        System.out.println("We get the switch manager successfully!!!!!");
    }

    public void unsetSwitchManager(ISwitchManager switchManager) {
        if (this.switchManager == switchManager) {
            this.switchManager = null;
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
        //timer.schedule(new MyTask(), 2000, scantime * 1000);
        startScan();
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
                    int oldTime=28800;
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

}
