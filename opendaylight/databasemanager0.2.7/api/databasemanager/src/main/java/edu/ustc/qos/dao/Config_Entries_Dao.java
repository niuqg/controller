package edu.ustc.qos.dao;

import java.util.List;

import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.Config_Entries;

public class Config_Entries_Dao extends BaseDao {

    public Config_Entries_Dao() {
        // TODO Auto-generated constructor stub
    }

    public int addConfig(Config_Entries config) throws Exception {
        return super
                .saveOrUpdate(
                        "insert into Config_Entries(Group_Name, User_ID,Datapath_ID,Table_ID"
                                + "Match_ID,Entry_Priority,Instruction_ID,Idle_Timeout,Hard_Timeout,State)values(?,?,?,?,?,?,?,?,?,?)",
                        config.getGroup_Name(), config.getUser_ID(),
                        config.getDatapath_ID(), config.getTable_ID(),
                        config.getMatch_ID(), config.getEntry_Priority(),
                        config.getInstruction_ID(), config.getIdle_Timeout(),
                        config.getHard_Timeout(), config.getState());
    }

    public int deleteUserByID(int configID) throws Exception {
        return super.saveOrUpdate(
                "delete from Config_Entries where ConfigEntry_ID=?", configID);
    }

    public int modConfig(int configID, Config_Entries config) throws Exception {
        return super
                .saveOrUpdate(
                        "update Config_Entries set Group_Name=?, User_ID=?,Datapath_ID=?,Table_ID=?"
                                + "Match_ID=?,Entry_Priority=?,Instruction_ID=?,Idle_Timeout=?,Hard_Timeout=?,State=? where ConfigEntry_ID=?",
                        config.getGroup_Name(), config.getUser_ID(),
                        config.getDatapath_ID(), config.getTable_ID(),
                        config.getMatch_ID(), config.getEntry_Priority(),
                        config.getInstruction_ID(), config.getIdle_Timeout(),
                        config.getHard_Timeout(), config.getState(), configID);
    }

    public List<Config_Entries> getConfigList() throws Exception {
        return super.executeQuery("select * from Config_Entries",
                Config_Entries.class);
    }
}
