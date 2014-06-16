package edu.ustc.qos.databasemanager;

import java.sql.Timestamp;

public class Net_Event {

    public Net_Event() {
        // TODO Auto-generated constructor stub
    }
    int Event_ID;
    int Event_Type;
    String Event_Description;
    Timestamp Time_Stamp;
    public int getEvent_ID() {
        return Event_ID;
    }
    public void setEvent_ID(int event_ID) {
        Event_ID = event_ID;
    }
    public int getEvent_Type() {
        return Event_Type;
    }
    public void setEvent_Type(int event_Type) {
        Event_Type = event_Type;
    }
    public String getEvent_Description() {
        return Event_Description;
    }
    public void setEvent_Description(String event_Description) {
        Event_Description = event_Description;
    }
    public Timestamp getTime_Stamp() {
        return Time_Stamp;
    }

}
