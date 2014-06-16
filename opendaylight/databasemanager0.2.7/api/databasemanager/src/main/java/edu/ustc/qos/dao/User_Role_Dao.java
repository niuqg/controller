package edu.ustc.qos.dao;

import java.util.List;

import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.User_Role;

public class User_Role_Dao extends BaseDao{

    public User_Role_Dao() {
        // TODO Auto-generated constructor stub
    }
    public int addUser_Role_Dao(User_Role user_role) throws Exception{
        return super.saveOrUpdate("insert into User_Role(Role_Name,Role_Description)values(?,?) ",
                user_role.getRole_Name(),user_role.getRole_Description());
    }
    public List<User_Role> getRoleList() throws Exception{
        return super.executeQuery("select * from User_Role", User_Role.class);
    }
    public int modRoleByID(int roleID,User_Role role) throws Exception{
        return super.saveOrUpdate("update User_Role set Role_Name=?, Role_Description=? where Role_ID=?",
                role.getRole_Name(),role.getRole_Description(),role.getRole_ID());
    }
    public int deleteRoleByID(int roleID)throws Exception{
        return super.saveOrUpdate("delete from User_Role where Role_ID=?", roleID);
    }
}
