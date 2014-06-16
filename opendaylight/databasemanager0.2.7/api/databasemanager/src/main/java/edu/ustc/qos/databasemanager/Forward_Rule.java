package edu.ustc.qos.databasemanager;

public class Forward_Rule {

    public Forward_Rule() {
        // TODO Auto-generated constructor stub
    }
    int Rule_ID;
    String Group_Name;
    int User_ID;
    int Match_ID;
    int Path_ID;
    int Entry_Priority;
    int Idle_Timeout;
    int Hard_Timeout;
    int Path_Bandwidth;
    int Path_State;
    public int getRule_ID() {
        return Rule_ID;
    }
    public void setRule_ID(int rule_ID) {
        Rule_ID = rule_ID;
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
    public int getMatch_ID() {
        return Match_ID;
    }
    public void setMatch_ID(int match_ID) {
        Match_ID = match_ID;
    }
    public int getPath_ID() {
        return Path_ID;
    }
    public void setPath_ID(int path_ID) {
        Path_ID = path_ID;
    }
    public int getEntry_Priority() {
        return Entry_Priority;
    }
    public void setEntry_Priority(int entry_Priority) {
        Entry_Priority = entry_Priority;
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
    public int getPath_Bandwidth() {
        return Path_Bandwidth;
    }
    public void setPath_Bandwidth(int path_Bandwidth) {
        Path_Bandwidth = path_Bandwidth;
    }
    public int getPath_State() {
        return Path_State;
    }
    public void setPath_State(int path_State) {
        Path_State = path_State;
    }
}
