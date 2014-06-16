package edu.ustc.qos.dao;

import java.util.List;
import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.Link_Info;

public class Link_InfoDao extends BaseDao {

    public Link_InfoDao() {
        // TODO Auto-generated constructor stub
    }

    public int addLink(Link_Info link) throws Exception {
        return super
                .saveOrUpdate(
                        "insert into Link_Info(Tail_Datapath_ID,Tail_Port_ID,"
                                + "Head_Datapath_ID,Head_Port_ID,Active_State) values(?,?,?,?,?)",
                        link.getTail_Datapath_ID(), link.getTail_Port_ID(),
                        link.getHead_Datapath_ID(), link.getHead_Port_ID(),
                        link.getActive_State());
    }

    public int deleteLink(int id) throws Exception {
        return super.saveOrUpdate("delete from Link_Info where Link_ID=?", id);
    }

    public int modLink(int id, Link_Info link) throws Exception {
        return super
                .saveOrUpdate(
                        "update Link_Info set Tail_Datapath_ID=?,Tail_Port_ID=?,"
                                + "Head_Datapath_ID=?,Head_Port_ID=?,Active_State=? where Link_ID=?",
                        link.getTail_Datapath_ID(), link.getTail_Port_ID(),
                        link.getHead_Datapath_ID(), link.getHead_Port_ID(),
                        link.getActive_State(), id);
    }

    public List<Link_Info> getLinkList() throws Exception {
        return super.executeQuery("select * from Link_Info", Link_Info.class);
    }
}
