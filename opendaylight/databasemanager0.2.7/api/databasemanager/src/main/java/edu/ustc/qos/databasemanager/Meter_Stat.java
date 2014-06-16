package edu.ustc.qos.databasemanager;

import java.sql.Timestamp;

public class Meter_Stat {

    public Meter_Stat() {
        // TODO Auto-generated constructor stub
    }
    int Item_ID;
    String Datapath_ID;
    long Meter_ID;
    String Meter_Band;
    long Input_Byte_Num;
    long Input_Pkt_Num;
    long Meter_Duration;
    Timestamp Time_Stamp;
    long flowCount;
    public long getInput_Pkt_Num() {
        return Input_Pkt_Num;
    }
    public void setInput_Pkt_Num(long input_Pkt_Num) {
        Input_Pkt_Num = input_Pkt_Num;
    }
    public long getFlowCount() {
        return flowCount;
    }
    public void setFlowCount(long flowCount) {
        this.flowCount = flowCount;
    }
    public void setMeter_ID(long meter_ID) {
        Meter_ID = meter_ID;
    }
    public int getItem_ID() {
        return Item_ID;
    }
    public void setItem_ID(int item_ID) {
        Item_ID = item_ID;
    }
    public String getDatapath_ID() {
        return Datapath_ID;
    }
    public void setDatapath_ID(String datapath_ID) {
        Datapath_ID = datapath_ID;
    }
    public long getMeter_ID() {
        return Meter_ID;
    }
    public void setMeter_ID(Long long1) {
        Meter_ID = long1;
    }
    public String getMeter_Band() {
        return Meter_Band;
    }
    public void setMeter_Band(String meter_Band) {
        Meter_Band = meter_Band;
    }
    public long getInput_Byte_Num() {
        return Input_Byte_Num;
    }
    public void setInput_Byte_Num(long l) {
        Input_Byte_Num = l;
    }
    public long getMeter_Duration() {
        return Meter_Duration;
    }
    public void setMeter_Duration(long meter_Duration) {
        Meter_Duration = meter_Duration;
    }
    public Timestamp getTime_Stamp() {
        return Time_Stamp;
    }
    public void setTime_Stamp(Timestamp time_Stamp) {
        Time_Stamp = time_Stamp;
    }

}
