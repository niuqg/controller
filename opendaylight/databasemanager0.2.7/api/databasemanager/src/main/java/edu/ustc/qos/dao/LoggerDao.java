package edu.ustc.qos.dao;

import java.util.List;

import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.System_Logger;

public class LoggerDao extends BaseDao {

    public LoggerDao() {
        // TODO Auto-generated constructor stub
    }

    public int addLog(System_Logger log) throws Exception {
        return super
                .saveOrUpdate(
                        "insert System_Logger(User_ID,User_Name,Operation,Operation_Description) values(?,?,?,?)",
                        log.getUser_ID(), log.getUser_Name(),
                        log.getOperation(), log.getOperation_Description());
    }

    public int deleteLog(int id) throws Exception {
        return super.saveOrUpdate(
                "delete * from System_Logger where Operation_ID=?", id);
    }

    public int modLog(System_Logger log) throws Exception {
        return super
                .saveOrUpdate(
                        "update System_Logger set User_ID=?,User_Name=?,Operation=?,Operation_Description=?",
                        log.getUser_ID(), log.getUser_Name(),
                        log.getOperation(), log.getOperation_Description());
    }

    public List<System_Logger> getList() throws Exception {
        return super.executeQuery("select * from System_Logger",
                System_Logger.class);
    }
}
