package edu.ustc.qos.dao;


import java.util.List;

import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.Switch_Info;
public class Switch_Info_Dao extends BaseDao{
    public int addSwitchData(Switch_Info switchInfo) throws Exception {
        return super.saveOrUpdate(
                "insert into Switch_Info(Datapath_ID,Switch_Name,Manufacture,Software,Hardware,Active_State,Serial_Number) values(?,?,?,?,?,?,?)",
                switchInfo.getDatapath_ID(),switchInfo.getSwitch_Name(),switchInfo.getManufacture(),switchInfo.getSoftware(),
                switchInfo.getHardware(),switchInfo.getActive_State(),switchInfo.getSerial_Number());
    }
    public Switch_Info getSwitchById(String id) throws Exception {
        if(super.executeQuery("select * from Switch_Info where Datapath_ID=?", Switch_Info.class,id)==null)
            return null;
        return super.executeQuery("select * from Switch_Info where Datapath_ID=?", Switch_Info.class,id).get(0);
    }
    public List<Switch_Info> getSwitchInfoList() throws Exception {
        return super.executeQuery("select * from Switch_Info", Switch_Info.class);
    }
    public int modSwitchById(String swID, Switch_Info swInfo) throws Exception {
        return super
                .saveOrUpdate(
                        "update Switch_Info set Switch_Name=?,Manufacture=?,Software=?,Hardware=? where Switch_ID=?",
                        swInfo.getSwitch_Name(),swInfo.getManufacture(),swInfo.getSoftware(),swInfo.getHardware(),swID);
    }
    public int deleteAllSwitch() throws Exception{
        return super
                .saveOrUpdate("delete from Switch_Info");
    }
}