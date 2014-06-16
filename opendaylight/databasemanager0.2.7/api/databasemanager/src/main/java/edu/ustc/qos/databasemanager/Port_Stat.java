package edu.ustc.qos.databasemanager;

import java.sql.Timestamp;

public class Port_Stat {

    public Port_Stat() {
        // TODO Auto-generated constructor stub
    }
    int Item_ID;
    String Datapath_ID;
    int Port_ID;
    long Trans_Byte_Num;
    long Recv_Byte_Num;
    public int getItem_ID() {
        return Item_ID;
    }
    public void setItem_ID(int item_ID) {
        Item_ID = item_ID;
    }
    public String getDatapath_ID() {
        return Datapath_ID;
    }
    public void setDatapath_ID(String id) {
        Datapath_ID = id;
    }
    public int getPort_ID() {
        return Port_ID;
    }
    public void setPort_ID(int port_ID) {
        Port_ID = port_ID;
    }
    public long getTrans_Byte_Num() {
        return Trans_Byte_Num;
    }
    public void setTrans_Byte_Num(long trans_Byte_Num) {
        Trans_Byte_Num = trans_Byte_Num;
    }
    public long getRecv_Byte_Num() {
        return Recv_Byte_Num;
    }
    public void setRecv_Byte_Num(long recv_Byte_Num) {
        Recv_Byte_Num = recv_Byte_Num;
    }
    public long getRecv_Pkt_Num() {
        return Recv_Pkt_Num;
    }
    public void setRecv_Pkt_Num(long recv_Pkt_Num) {
        Recv_Pkt_Num = recv_Pkt_Num;
    }
    public long getTrans_Pkt_Loss() {
        return Trans_Pkt_Loss;
    }
    public void setTrans_Pkt_Loss(long trans_Pkt_Loss) {
        Trans_Pkt_Loss = trans_Pkt_Loss;
    }
    public long getRecv_Pkt_Loss() {
        return Recv_Pkt_Loss;
    }
    public void setRecv_Pkt_Loss(long recv_Pkt_Loss) {
        Recv_Pkt_Loss = recv_Pkt_Loss;
    }
    public long getTrans_Pkt_Error() {
        return Trans_Pkt_Error;
    }
    public void setTrans_Pkt_Error(long trans_Pkt_Error) {
        Trans_Pkt_Error = trans_Pkt_Error;
    }
    public long getRecv_Pkt_Error() {
        return Recv_Pkt_Error;
    }
    public void setRecv_Pkt_Error(long recv_Pkt_Error) {
        Recv_Pkt_Error = recv_Pkt_Error;
    }
    public long getPort_Duration() {
        return Port_Duration;
    }
    public void setPort_Duration(long port_Duration) {
        Port_Duration = port_Duration;
    }
    public Timestamp getTime_Stamp() {
        return Time_Stamp;
    }
    public void setTime_Stamp(Timestamp time_Stamp) {
        Time_Stamp = time_Stamp;
    }
    public long getTrans_Pkt_Num() {
        return Trans_Pkt_Num;
    }
    long Trans_Pkt_Num;
    long Recv_Pkt_Num;
    long Trans_Pkt_Loss;
    long Recv_Pkt_Loss;
    long Trans_Pkt_Error;
    long Recv_Pkt_Error;
    long Port_Duration;
    Timestamp Time_Stamp;
}
