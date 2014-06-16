package edu.ustc.smartqos.hdsal.demo;

import java.util.List;
import java.util.Timer;

import org.opendaylight.controller.md.sal.binding.util.TypeSafeDataReader;
import org.opendaylight.controller.sal.binding.api.data.DataBrokerService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowCapableNode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.meters.Meter;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.NodeMeterStatistics;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier.InstanceIdentifierBuilder;

import com.google.common.base.Objects;

import edu.ustc.qos.dao.Meter_Stat_Dao;
import edu.ustc.qos.databasemanager.Meter_Stat;

public class MeterStatus {
    private DataBrokerService dataService;
    private Meter_Stat meterStat;
    private Meter_Stat_Dao meterDao;
    private Timer timer = new Timer();
    private int mCount=0;
    private int scantime = 15;
    private int oldTime=28800;
    public MeterStatus(DataBrokerService dataService) {
		this.dataService = dataService;
		this.meterStat=new Meter_Stat();
		this.meterDao=new Meter_Stat_Dao();
	}
    public MeterStatus(DataBrokerService dataService,int scan ,int old ){
        this.dataService = dataService;
        this.meterStat=new Meter_Stat();
        this.meterDao=new Meter_Stat_Dao();
        this.scantime=scan;
        this.oldTime=old;
    }
    public void getMeterStas(){
    	 List<Node> list = this.readAllMDNodes().getNode();
         if (list != null)
             System.out
                     .println("11111111111111111111----List<Node> is not null------1111111111111111111111");

         for (Node node : list) {
             final FlowCapableNode dsFlowCapableNode = node
                     .<FlowCapableNode> getAugmentation(FlowCapableNode.class);
             boolean notEquals = (!Objects.equal(dsFlowCapableNode, null));
             System.out.println("###################notEquals is :"+notEquals);
             if (notEquals){
                 System.out.println(dsFlowCapableNode.getMeter());
                 for(Meter m: dsFlowCapableNode.getMeter()){
                     NodeMeterStatistics tableStats = m.<NodeMeterStatistics>getAugmentation(NodeMeterStatistics.class);
                     if(tableStats!=null){
                     MeterStatistics m1=tableStats.getMeterStatistics();
                     meterStat.setMeter_ID(m1.getMeterId().getValue());
                     meterStat.setInput_Byte_Num(m1.getByteInCount().getValue().longValue());
                     System.out.println(m1.getByteInCount().getValue());
                     meterStat.setMeter_Duration(m1.getDuration().getSecond().getValue().longValue());
                     meterStat.setInput_Pkt_Num(m1.getPacketInCount().getValue().longValue());
                     meterStat.setFlowCount(m1.getFlowCount().getValue().longValue());
                     meterStat.setDatapath_ID(node.getId().getValue());
                     try {
						meterDao.addMeter_Stat(meterStat);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                     System.out.println("~~~~~~~~~~~~~~~~~meterID  is"+m1.getMeterId());
                 }else{
                     System.out.print("tableStat is null***************************");
                 }
             }
         }}
    }
    public void start() {
        System.out.println("\n\nScan The Meter\n\n");
        timer.schedule(new MyTask(), 2000, scantime * 1000);
    }
    public class MyTask extends java.util.TimerTask {
        @Override
        public void run() {
            System.out.print("\n\nMyTask::" + mCount + "::Strats.");
            getMeterStas();
            if (mCount % 60 == 0) {
                try {
                    meterDao.deleteOld(oldTime);
                } catch (Exception e) {
                    System.out.println("Delete Old Data Failed ");
                }
            }
            System.out.print("....Ends.");
            mCount++;
        }
    }
	private Nodes readAllMDNodes() {
        InstanceIdentifierBuilder<Nodes> builder = InstanceIdentifier
                .<Nodes> builder(Nodes.class);
        final InstanceIdentifier<Nodes> nodesRef = builder.toInstance();
        DataBrokerService data = this.getDataService();
        final TypeSafeDataReader reader = TypeSafeDataReader.forReader(data);
        return reader.<Nodes> readOperationalData(nodesRef);
    }
    public void setDataService(final DataBrokerService dataService) {
        this.dataService = dataService;
    }

    public DataBrokerService getDataService() {
        return this.dataService;
    }

}
