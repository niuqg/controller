package edu.ustc.qos.databasemanager;

/**
 * @author nqg
 *
 */
public class User {

    public User() {
        // TODO Auto-generated constructor stub
    }

    int User_ID;
    String User_Name;
    String User_Password;
    int Role_ID;
    String User_Description;

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

    public String getUser_Password() {
        return User_Password;
    }

    public void setUser_Password(String user_Password) {
        User_Password = user_Password;
    }

    public int getRole_ID() {
        return Role_ID;
    }

    public void setRole_ID(int role_ID) {
        Role_ID = role_ID;
    }

    public String getUser_Description() {
        return User_Description;
    }

    public void setUser_Description(String user_Description) {
        User_Description = user_Description;
    }
}
