package edu.ustc.qos.dao;

import java.util.List;

import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.Host_QoS;

public class Host_QoS_Dao extends BaseDao {

    public Host_QoS_Dao() {
        // TODO Auto-generated constructor stub
    }

    public int addHQoS(Host_QoS hQoS) throws Exception {
        return super
                .saveOrUpdate(
                        "intsert into Host_QoS(HQ_Name,Host_MAC,Host_IP,User_ID,HQGroup_ID,HQ_State)values(?,?,?,?,?,?)",
                        hQoS.getHQ_Name(), hQoS.getHost_MAC(),
                        hQoS.getHost_IP(), hQoS.getUser_ID(),
                        hQoS.getHQGroup_ID(), hQoS.getHQ_State());
    }

    public int deleteHQoS(int hQoSID) throws Exception {
        return super.saveOrUpdate("delete from Host_QoS where HQ_ID=?", hQoSID);
    }

    public int modHQoS(int HQoSID, Host_QoS hqos) throws Exception {
        return super
                .saveOrUpdate(
                        "update Host_QoS set HQ_Name=?,Host_MAC=?,Host_IP=?,User_ID=?,HQGroup_ID=?,HQ_State=? where HQ_ID=?",
                        hqos.getHQ_Name(), hqos.getHost_MAC(),
                        hqos.getHost_IP(), hqos.getUser_ID(),
                        hqos.getHQGroup_ID(), hqos.getHQ_State(), HQoSID);
    }

    public List<Host_QoS> getHQList() throws Exception {
        return super.executeQuery("select * from Host_QoS", Host_QoS.class);
    }
}
