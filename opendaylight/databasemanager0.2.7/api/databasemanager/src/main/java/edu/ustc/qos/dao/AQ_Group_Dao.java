package edu.ustc.qos.dao;

import java.util.List;

import edu.ustc.qos.databasemanager.AQ_Group;
import edu.ustc.qos.databasemanager.BaseDao;

public class AQ_Group_Dao extends BaseDao{

    public AQ_Group_Dao() {
        // TODO Auto-generated constructor stub
    }
    public int addAQGroup(AQ_Group aqGroup)throws Exception{
        return super.saveOrUpdate("insert into AQ_Group(AQ_Up_Bandwidth,AQ_Down_Bandwidth)values(?,?)",
                aqGroup.getAQ_Up_Bandwidth(),aqGroup.getAQ_Down_Bandwidth());
    }
    public int deleteAQGByID(int AQGID)throws Exception{
        return super.saveOrUpdate("delete from AQ_Group where AQGroup_ID=?", AQGID);
    }
    public int modAQGByID(int AQGID,AQ_Group aqg)throws Exception{
        return super.saveOrUpdate("update AQ_Group set AQ_Up_Bandwidth=?, AQ_Down_Bandwidth=? where AQGroup_ID=?",
                aqg.getAQ_Up_Bandwidth(),aqg.getAQ_Down_Bandwidth(),AQGID);
    }
    public List<AQ_Group> getAQGList()throws Exception{
        return super.executeQuery("select * from AQ_Group", AQ_Group.class);
    }
}
