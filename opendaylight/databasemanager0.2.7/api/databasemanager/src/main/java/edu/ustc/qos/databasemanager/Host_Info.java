package edu.ustc.qos.databasemanager;

public class Host_Info {

    public Host_Info() {
        // TODO Auto-generated constructor stub
    }
    int Host_ID;
    String Host_Name;
    String Host_MAC;
    String IPv4_Addr;
    String IPv6_Addr;
    long Datapath_ID;
    int Port_ID;
    int Active_State;
    public int getHost_ID() {
        return Host_ID;
    }
    public void setHost_ID(int host_ID) {
        Host_ID = host_ID;
    }
    public String getHost_Name() {
        return Host_Name;
    }
    public void setHost_Name(String host_Name) {
        Host_Name = host_Name;
    }
    public String getHost_MAC() {
        return Host_MAC;
    }
    public void setHost_MAC(String host_MAC) {
        Host_MAC = host_MAC;
    }
    public String getIPv4_Addr() {
        return IPv4_Addr;
    }
    public void setIPv4_Addr(String iPv4_Addr) {
        IPv4_Addr = iPv4_Addr;
    }
    public String getIPv6_Addr() {
        return IPv6_Addr;
    }
    public void setIPv6_Addr(String iPv6_Addr) {
        IPv6_Addr = iPv6_Addr;
    }
    public long getDatapath_ID() {
        return Datapath_ID;
    }
    public void setDatapath_ID(long datapath_ID) {
        Datapath_ID = datapath_ID;
    }
    public int getPort_ID() {
        return Port_ID;
    }
    public void setPort_ID(int port_ID) {
        Port_ID = port_ID;
    }
    public int getActive_State() {
        return Active_State;
    }
    public void setActive_State(int active_State) {
        Active_State = active_State;
    }
}
