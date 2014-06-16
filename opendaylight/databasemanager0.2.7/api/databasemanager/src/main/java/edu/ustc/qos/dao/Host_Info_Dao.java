package edu.ustc.qos.dao;
import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.Host_Info;;
public class Host_Info_Dao extends BaseDao{
    public int addHostInfo(Host_Info hostInfo) throws Exception {
        return super.saveOrUpdate(
               "insert into Host_Info(Host_ID,Host_Name,Host_MAC,IPv4_Addr,Datapath_ID,Port_ID) values(?,?,?,?,?,?)",
                hostInfo.getHost_ID(),hostInfo.getHost_Name(),hostInfo.getHost_MAC(),hostInfo.getIPv4_Addr(),
                hostInfo.getDatapath_ID(),hostInfo.getPort_ID());
    }
    public Host_Info getHostById(int id) throws Exception {
        return super.executeQuery("select * from Host_Info where Host_ID=?", Host_Info.class,id).get(0);
    }
    public int modHostInfoById(int hInfoID, Host_Info hInfo) throws Exception {
        return super
                .saveOrUpdate(
                        "update Host_Info set Host_Name=?,Host_MAC=?,IPv4_Addr=?,Datapath_ID=?,Port_ID=? where Host_ID=?",
                        hInfo.getHost_Name(),hInfo.getHost_MAC(),hInfo.getIPv4_Addr(),hInfo.getDatapath_ID(),
                        hInfo.getPort_ID(),hInfoID);
    }
    public Host_Info getHostByName(String name) throws Exception {
        if(super.executeQuery("select * from Host_Info where Host_Name=?", Host_Info.class,name)!=null)
            return super.executeQuery("select * from Host_Info where Host_Name=?", Host_Info.class,name).get(0);
        return null;
    }
    public int modHostInfoByName(String name, Host_Info hInfo) throws Exception {
        return super
                .saveOrUpdate(
                        "update Host_Info set Host_MAC=?,IPv4_Addr=?,Datapath_ID=?,Port_ID=? where Host_Name=?",
                        hInfo.getHost_MAC(),hInfo.getIPv4_Addr(),hInfo.getDatapath_ID(),hInfo.getPort_ID(),
                        name);
    }
    public int deleteAllHost() throws Exception{
        return super
                .saveOrUpdate("delete from Host_Info");
    }
}
