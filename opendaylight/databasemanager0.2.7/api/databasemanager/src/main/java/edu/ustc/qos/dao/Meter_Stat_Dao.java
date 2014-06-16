package edu.ustc.qos.dao;

import java.util.List;

import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.Meter_Stat;

public class Meter_Stat_Dao extends BaseDao{

    public Meter_Stat_Dao() {
        // TODO Auto-generated constructor stub
    }
    public int addMeter_Stat(Meter_Stat meter)throws Exception{
        return super.saveOrUpdate("insert into Meter_Stat(Datapath_ID, Meter_ID,Meter_Band,Input_Byte_Num,Input_Pkt_Num,Meter_Duration)values(?,?,?,?,?,?)",
                meter.getDatapath_ID(),meter.getMeter_ID(),meter.getMeter_Band(),meter.getInput_Byte_Num(),meter.getInput_Pkt_Num(),meter.getMeter_Duration());
    }
    public List<Meter_Stat>getMeter_Stat()throws Exception{
        return super.executeQuery("select * from Meter_Stat", Meter_Stat.class);
    }
    public int deleteOld(int oldTime) throws Exception{
        return super.saveOrUpdate("delete frome Meter_Stat where endTime<(select "
                + "DATEDIFF(second,'1970-01-01 00:00:00.000',getdate())-?)", oldTime);
    }
}
