package edu.ustc.qos.dao;

import java.util.List;

import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.Net_Event;

public class Net_EventDao extends BaseDao {

    public Net_EventDao() {
        // TODO Auto-generated constructor stub
    }

    public int addEvent(Net_Event event) throws Exception {
        return super
                .saveOrUpdate(
                        "insert into Net_Event(Event_Type,Event_Description) values(?,?)",
                        event.getEvent_Type(), event.getEvent_Description());
    }

    public int deleteEvent(int id) throws Exception {
        return super.saveOrUpdate("delete from Net_Event where Event_ID=?", id);
    }

    public int modEvent(Net_Event event) throws Exception {
        return super
                .saveOrUpdate(
                        "update Net_Event set Event_Type=?,Event_Description=? where Event_ID=?",
                        event.getEvent_Type(), event.getEvent_Description(),
                        event.getEvent_ID());
    }

    public List<Net_Event> getList() throws Exception {
        return super.executeQuery("select * from Net_Event", Net_Event.class);
    }
}
