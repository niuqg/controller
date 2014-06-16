package edu.ustc.qos.databasemanager;

public class Switch_Info {

    public Switch_Info() {
        // TODO Auto-generated constructor stub
    }
    int Switch_ID;
    String Datapath_ID;
    String Switch_Name;
    String Manufacture;
    String Software;
    String Hardware;
    String Serial_Number;
    int Active_State;
    public int getSwitch_ID() {
        return Switch_ID;
    }
    public void setSwitch_ID(int switch_ID) {
        Switch_ID = switch_ID;
    }
    public String getDatapath_ID() {
        return Datapath_ID;
    }
    public void setDatapath_ID(String datapath_ID) {
        Datapath_ID = datapath_ID;
    }
    public String getSwitch_Name() {
        return Switch_Name;
    }
    public void setSwitch_Name(String switch_Name) {
        Switch_Name = switch_Name;
    }
    public String getManufacture() {
        return Manufacture;
    }
    public void setManufacture(String manufacture) {
        Manufacture = manufacture;
    }
    public String getSoftware() {
        return Software;
    }
    public void setSoftware(String software) {
        Software = software;
    }
    public String getHardware() {
        return Hardware;
    }
    public void setHardware(String hardware) {
        Hardware = hardware;
    }
    public String getSerial_Number() {
        return Serial_Number;
    }
    public void setSerial_Number(String serial_Number) {
        Serial_Number = serial_Number;
    }
    public int getActive_State() {
        return Active_State;
    }
    public void setActive_State(int active_State) {
        Active_State = active_State;
    }
}
