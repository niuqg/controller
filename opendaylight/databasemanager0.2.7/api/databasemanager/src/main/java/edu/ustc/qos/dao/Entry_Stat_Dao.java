package edu.ustc.qos.dao;

import java.util.List;

import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.Entry_Stat;

public class Entry_Stat_Dao extends BaseDao {

    public Entry_Stat_Dao() {
        // TODO Auto-generated constructor stub
    }

    public int addEntry_Stat(Entry_Stat entry) throws Exception {
        return super
                .saveOrUpdate(
                        "insert Entry_Stat(Datapath_ID,Table_ID,Match_ID,Entry_Priotity,Instruction_ID,Idle_Timeout,Hard_Timeout,"
                                + "Byte_Num,Pkt_Num,Entry_Duration)values(?,?,?,?,?,?,?,?,?,?)",
                        entry.getDatapath_ID(), entry.getTable_ID(),
                        entry.getMatch_ID(), entry.getEntry_Priotity(),
                        entry.getInstruction_ID(), entry.getIdle_Timeout(),
                        entry.getHard_Timeout(), entry.getByte_Num(),
                        entry.getPkt_Num(), entry.getEntry_Duration());
    }

    public List<Entry_Stat> getEntry_Stat() throws Exception {
        return super.executeQuery("select * from Entry_Stat", Entry_Stat.class);
    }

    public int deleteOld(int oldTime) throws Exception {
        return super
                .saveOrUpdate(
                        "delete frome Entry_Stat where endTime<(select "
                                + "DATEDIFF(second,'1970-01-01 00:00:00.000',getdate())-?)",
                        oldTime);
    }
}
