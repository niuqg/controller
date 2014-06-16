package edu.ustc.qos.dao;

import java.util.List;

import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.Port_Stat;

public class Port_Stat_Dao extends BaseDao{

    public Port_Stat_Dao() {
        // TODO Auto-generated constructor stub
    }
    public int addPort_Stat(Port_Stat port_stat) throws Exception {
        return super.saveOrUpdate(
                "insert into Port_Stat(Datapath_ID,Port_ID,Trans_Byte_Num,Recv_Byte_Num,Trans_Pkt_Num,Recv_Pkt_Num,Trans_Pkt_Loss,Recv_Pkt_Loss,Trans_Pkt_Error,Recv_Pkt_Error,Port_Duration) values(?,?,?,?,?,?,?,?,?,?,?)",
               port_stat.getDatapath_ID(),port_stat.getPort_ID(),port_stat.getTrans_Byte_Num(),port_stat.getRecv_Byte_Num(),port_stat.getTrans_Pkt_Num(),
               port_stat.getRecv_Pkt_Num(),port_stat.getTrans_Pkt_Loss(),port_stat.getRecv_Pkt_Loss(),port_stat.getTrans_Pkt_Error(),
               port_stat.getRecv_Pkt_Error(),port_stat.getPort_Duration());
    }
    public List<Port_Stat> getPort_Stat() throws Exception {
        return super.executeQuery("select * from Port_Stat", Port_Stat.class);
    }
    public int deleteOld(int oldTime) throws Exception{
        return super.saveOrUpdate("delete frome Port_Stat where endTime<(select "
                + "DATEDIFF(second,'1970-01-01 00:00:00.000',getdate())-?)", oldTime);
    }
}
