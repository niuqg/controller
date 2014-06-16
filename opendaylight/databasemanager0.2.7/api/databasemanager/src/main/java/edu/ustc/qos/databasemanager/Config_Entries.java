package edu.ustc.qos.databasemanager;

public class Config_Entries {

    public Config_Entries() {
        // TODO Auto-generated constructor stub
    }
    int ConfigEntry_ID;
    String Group_Name;
    int User_ID;
    int Datapath_ID;
    int Table_ID;
    int Match_ID;
    int Entry_Priority;
    int Instruction_ID;
    int Idle_Timeout;
    int Hard_Timeout;
    int State;
    public int getConfigEntry_ID() {
        return ConfigEntry_ID;
    }
    public void setConfigEntry_ID(int configEntry_ID) {
        ConfigEntry_ID = configEntry_ID;
    }
    public String getGroup_Name() {
        return Group_Name;
    }
    public void setGroup_Name(String group_Name) {
        Group_Name = group_Name;
    }
    public int getUser_ID() {
        return User_ID;
    }
    public void setUser_ID(int user_ID) {
        User_ID = user_ID;
    }
    public int getDatapath_ID() {
        return Datapath_ID;
    }
    public void setDatapath_ID(int datapath_ID) {
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
    public int getEntry_Priority() {
        return Entry_Priority;
    }
    public void setEntry_Priority(int entry_Priority) {
        Entry_Priority = entry_Priority;
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
    public int getState() {
        return State;
    }
    public void setState(int state) {
        State = state;
    }
}
