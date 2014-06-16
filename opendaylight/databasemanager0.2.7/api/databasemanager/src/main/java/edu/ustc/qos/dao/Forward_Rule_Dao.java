package edu.ustc.qos.dao;

import java.util.List;

import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.Forward_Rule;

public class Forward_Rule_Dao extends BaseDao{

    public Forward_Rule_Dao() {
        // TODO Auto-generated constructor stub
    }
    public int addRule(Forward_Rule rule)throws Exception{
        return super.saveOrUpdate("insert into Forward_Rule(Group_Name, User_ID,Match_ID,Path_ID,Entry_Priority,"
                + "Idle_Timeout,Hard_Timeout,Path_Bandwidth,Path_State) values(?,?,?,?,?,?,?,?,?)",rule.getGroup_Name(),rule.getUser_ID(),rule.getMatch_ID(),rule.getPath_ID(),rule.getEntry_Priority(),
                rule.getIdle_Timeout(),rule.getHard_Timeout(),rule.getPath_Bandwidth(),rule.getPath_State());
    }
    public int deleteRuleByID(int ruleID)throws Exception{
        return super.saveOrUpdate("delete form Forward_Rule where Rule_ID=?", ruleID);
    }
    public int modeRuleByID(int ruleID,Forward_Rule rule)throws Exception{
        return super.saveOrUpdate("update Forward_Rule set Group_Name=?, User_ID=?,Match_ID=?,Path_ID=?,Entry_Priority=?,"
                + "Idle_Timeout=?,Hard_Timeout=?,Path_Bandwidth=?,Path_State=? where Rule_ID=?",rule.getGroup_Name(),rule.getUser_ID(),rule.getMatch_ID(),rule.getPath_ID(),rule.getEntry_Priority(),
                rule.getIdle_Timeout(),rule.getHard_Timeout(),rule.getPath_Bandwidth(),rule.getPath_State(),ruleID );
    }
    public List<Forward_Rule> getRuleList()throws Exception{
        return super.executeQuery("select * from Forward_Rule", Forward_Rule.class);
    }
}
