package edu.ustc.qos.databasemanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbHelper {
    protected static Connection con = null;
    static String driver = "com.mysql.jdbc.Driver";
    static String PGUrl = "jdbc:mysql://219.219.216.100:3306/qos2014?useUnicode=true&characterEncoding=gb2312";
    static String PGUser = "root";
    static String PGPasswd = "123";
    public static Connection getConn() throws Exception{
        //try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(PGUrl, PGUser, PGPasswd);
       // }catch (Exception e) {
            // TODO Auto-generated catch block
        //    e.printStackTrace();
       // }
        return con;
    }
    public static void closeConn(Connection conn, Statement ps, ResultSet rs){
        try {
            if (rs != null) {
                rs.close();
                rs = null;
            }
            if (ps != null) {
                ps.close();
                ps = null;
            }
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
