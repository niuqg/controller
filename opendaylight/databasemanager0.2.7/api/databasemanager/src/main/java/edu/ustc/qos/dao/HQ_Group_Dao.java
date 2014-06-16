package edu.ustc.qos.dao;

import java.util.List;

import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.HQ_Group;

public class HQ_Group_Dao extends BaseDao{

    public HQ_Group_Dao() {
        // TODO Auto-generated constructor stub
    }
    public int addHQG(HQ_Group hqg) throws Exception{
        return super.saveOrUpdate("intsert into HQ_Group(HQ_Priority, HQ_Up_Bandwidth,HQ_Down_Bandwidth)values(?,?,?)",
                hqg.getHQ_Priority(),hqg.getHQ_Up_Bandwidth(),hqg.getHQ_Down_Bandwidth());
    }
    public int deleteUserByID(int hqgID)throws Exception{
        return super.saveOrUpdate("delete from HQ_Group where HQGroup_ID=?", hqgID);
    }
    public int modHQGByID(int hqgID,HQ_Group hqg)throws Exception{
        return super.saveOrUpdate("update HQ_Group set HQ_Priority=?, HQ_Up_Bandwidth=?,HQ_Down_Bandwidth=? where HQGroup_ID=?",
                hqg.getHQ_Priority(),hqg.getHQ_Up_Bandwidth(),hqg.getHQ_Down_Bandwidth(),hqgID);
    }
    public List<HQ_Group> getHQGList()throws Exception{
        return super.executeQuery("select * from HQ_Group", HQ_Group.class);
    }
}
