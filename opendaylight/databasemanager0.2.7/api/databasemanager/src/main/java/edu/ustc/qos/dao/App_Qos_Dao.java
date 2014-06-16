package edu.ustc.qos.dao;

import java.util.List;

import edu.ustc.qos.databasemanager.App_QoS;
import edu.ustc.qos.databasemanager.BaseDao;

public class App_Qos_Dao extends BaseDao {

    public App_Qos_Dao() {
        // TODO Auto-generated constructor stub
    }

    public int addUser(App_QoS app) throws Exception {
        return super
                .saveOrUpdate(
                        "insert into App_QoS(AQ_Name, IP_Type,Protocol_Name,Port_ID,User_ID,AQGroup_ID,AQ_State)values(?,?,?,?,?,?,?)",
                        app.getAQ_Name(), app.getIP_Type(),
                        app.getProtocol_Name(), app.getPort_ID(),
                        app.getUser_ID(), app.getAQGroup_ID(),
                        app.getAQ_State());
    }

    public int deleteUserByID(int appID) throws Exception {
        return super.saveOrUpdate("delete from App_QoS where AQ_ID=?", appID);
    }

    public int modAQByID(int aqID, App_QoS app) throws Exception {
        return super
                .saveOrUpdate(
                        "update App_Qos set AQ_Name=?, IP_Type=?,Protocol_Name=?,Port_ID=?,User_ID=?,AQGroup_ID=?,AQ_State=? where AQ_ID=?",
                        app.getAQ_Name(), app.getIP_Type(),
                        app.getProtocol_Name(), app.getPort_ID(),
                        app.getUser_ID(), app.getAQGroup_ID(),
                        app.getAQ_State(), aqID);
    }

    public List<App_QoS> getAQList() throws Exception {
        return super.executeQuery("select * from App_QoS", App_QoS.class);
    }
}
