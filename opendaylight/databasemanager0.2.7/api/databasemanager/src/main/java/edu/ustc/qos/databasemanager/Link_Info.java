package edu.ustc.qos.databasemanager;

public class Link_Info {

    public Link_Info() {
        // TODO Auto-generated constructor stub
    }
    int Link_ID;
    long Tail_Datapath_ID;
    int Tail_Port_ID;
    long Head_Datapath_ID;
    int Head_Port_ID;
    int Active_State;
    public int getLink_ID() {
        return Link_ID;
    }
    public void setLink_ID(int link_ID) {
        Link_ID = link_ID;
    }
    public long getTail_Datapath_ID() {
        return Tail_Datapath_ID;
    }
    public void setTail_Datapath_ID(long tail_Datapath_ID) {
        Tail_Datapath_ID = tail_Datapath_ID;
    }
    public int getTail_Port_ID() {
        return Tail_Port_ID;
    }
    public void setTail_Port_ID(int tail_Port_ID) {
        Tail_Port_ID = tail_Port_ID;
    }
    public long getHead_Datapath_ID() {
        return Head_Datapath_ID;
    }
    public void setHead_Datapath_ID(long head_Datapath_ID) {
        Head_Datapath_ID = head_Datapath_ID;
    }
    public int getHead_Port_ID() {
        return Head_Port_ID;
    }
    public void setHead_Port_ID(int head_Port_ID) {
        Head_Port_ID = head_Port_ID;
    }
    public int getActive_State() {
        return Active_State;
    }
    public void setActive_State(int active_State) {
        Active_State = active_State;
    }
}
