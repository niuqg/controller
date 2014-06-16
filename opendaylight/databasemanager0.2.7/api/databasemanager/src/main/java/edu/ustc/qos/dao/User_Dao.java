package edu.ustc.qos.dao;

import java.util.List;
import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.User;

/**
 * 用于测试的UserDao
 *
 * @author
 *
 */
public class User_Dao extends BaseDao {

    public int addUser(User user) throws Exception {
        return super
                .saveOrUpdate(
                        "insert into User(User_Name,User_Password,Role_ID,User_Description) values(?,?,?,?)",
                        user.getUser_Name(), user.getUser_Password(),
                        user.getRole_ID(), user.getUser_Description());
    }

    public int deleteUserById(int userId) throws Exception {
        return super.saveOrUpdate("delete from User where User_ID=?", userId);
    }

    public int modUserById(int userId, User user) throws Exception {
        return super
                .saveOrUpdate(
                        "update User set User_Name=?,User_Password=?,Role_ID=?,User_Description=? where User_ID=?",
                        user.getUser_Name(), user.getUser_Password(),
                        user.getRole_ID(), user.getUser_Description(), userId);
    }

    public User getUserbyId(int userId) throws Exception {
        return super.executeQuery("select * from User where User_ID=?",
                User.class, userId).get(0);
    }

    public User getUserbyname(String name) throws Exception {
        if (super.executeQuery("select * from User where User_Name=?",
                User.class, name) != null)
            return super.executeQuery("select * from User where User_Name=?",
                    User.class, name).get(0);
        return null;
    }

    public List<User> getUserList() throws Exception {
        return super.executeQuery("select * from User", User.class);
    }

    public long getUserCount() throws Exception {
        return super.getCount("select count(*) from User");
    }
}