package edu.ustc.qos.databasemanager;

import java.sql.Timestamp;

public class System_Logger {

    public System_Logger() {
        // TODO Auto-generated constructor stub
    }
    int Operation_ID;
    int User_ID;
    String User_Name;
    int Operation;
    String Operation_Description;
    Timestamp Time_Stamp;
    public int getOperation_ID() {
        return Operation_ID;
    }
    public void setOperation_ID(int operation_ID) {
        Operation_ID = operation_ID;
    }
    public int getUser_ID() {
        return User_ID;
    }
    public void setUser_ID(int user_ID) {
        User_ID = user_ID;
    }
    public String getUser_Name() {
        return User_Name;
    }
    public void setUser_Name(String user_Name) {
        User_Name = user_Name;
    }
    public int getOperation() {
        return Operation;
    }
    public void setOperation(int operation) {
        Operation = operation;
    }
    public String getOperation_Description() {
        return Operation_Description;
    }
    public void setOperation_Description(String operation_Description) {
        Operation_Description = operation_Description;
    }
    public Timestamp getTime_Stamp() {
        return Time_Stamp;
    }
}
