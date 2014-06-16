package edu.ustc.qos.databasemanager;

import java.sql.Timestamp;

public class Entry_Stat {

    public Entry_Stat() {
        // TODO Auto-generated constructor stub
    }
    long Entry_ID;
    String Datapath_ID;
    int Table_ID;
    int Match_ID;
    int Entry_Priotity;
    int Instruction_ID;
    int Idle_Timeout;
    int Hard_Timeout;
    long Byte_Num;
    long Pkt_Num;
    long Entry_Duration;
    Timestamp Time_Stamp;
    public long getEntry_ID() {
        return Entry_ID;
    }
    public void setEntry_ID(long entry_ID) {
        Entry_ID = entry_ID;
    }
    public String getDatapath_ID() {
        return Datapath_ID;
    }
    public void setDatapath_ID(String datapath_ID) {
        Datapath_ID = datapath_ID;
    }
    public int getTable_ID() {
        return Table_ID;
    }
    public void setTable_ID(int table_ID) {
        Table_ID = table_ID;
    }
    public int getMatch_ID() {
        return Match_ID;
    }
    public void setMatch_ID(int match_ID) {
        Match_ID = match_ID;
    }
    public int getEntry_Priotity() {
        return Entry_Priotity;
    }
    public void setEntry_Priotity(int entry_Priotity) {
        Entry_Priotity = entry_Priotity;
    }
    public int getInstruction_ID() {
        return Instruction_ID;
    }
    public void setInstruction_ID(int instruction_ID) {
        Instruction_ID = instruction_ID;
    }
    public int getIdle_Timeout() {
        return Idle_Timeout;
    }
    public void setIdle_Timeout(int idle_Timeout) {
        Idle_Timeout = idle_Timeout;
    }
    public int getHard_Timeout() {
        return Hard_Timeout;
    }
    public void setHard_Timeout(int hard_Timeout) {
        Hard_Timeout = hard_Timeout;
    }
    public long getByte_Num() {
        return Byte_Num;
    }
    public void setByte_Num(long byte_Num) {
        Byte_Num = byte_Num;
    }
    public long getPkt_Num() {
        return Pkt_Num;
    }
    public void setPkt_Num(long pkt_Num) {
        Pkt_Num = pkt_Num;
    }
    public long getEntry_Duration() {
        return Entry_Duration;
    }
    public void setEntry_Duration(long entry_Duration) {
        Entry_Duration = entry_Duration;
    }
    public Timestamp getTime_Stamp() {
        return Time_Stamp;
    }
}
