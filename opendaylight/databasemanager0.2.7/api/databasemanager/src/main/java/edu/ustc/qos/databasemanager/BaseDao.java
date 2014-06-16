package edu.ustc.qos.databasemanager;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BaseDao {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    /**
     * 查询符合条件的记录数
     *
     * @param sql
     *            要执行的sql语句
     * @param args
     *            给sql语句中的？赋值的参数列表
     * @return 符合条件的记录数
     * @throws Exception
     */
    public long getCount(String sql, Object... args) throws Exception {
        conn = dbHelper.getConn();
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbHelper.closeConn(conn, ps, rs);
        }
        return 0L;
    }

    /**
     * 查询实体对象的，并封装到一个集合
     *
     * @param <T>
     *            要查询的对象的集合
     * @param sql
     *            要执行的sql语句
     * @param clazz
     *            要查询的对象的类型
     * @param args
     *            给sql语句中的？赋值的参数列表
     * @return 要查询的类的集合，无结果时返回null
     * @throws Exception
     */
    public <T> List<T> executeQuery(String sql, Class<T> clazz, Object... args) throws Exception {
        conn = dbHelper.getConn();
        List list = new ArrayList();
            ps = conn.prepareStatement(sql);
            try {
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            rs = ps.executeQuery();
          //getDeclaredFields()获得某个类的所有申明的字段，即包括public、private和proteced，但是不包括父类的申明字段。
            Field[] fs = clazz.getDeclaredFields();
            String[] colNames = new String[fs.length];//名字
            String[] rTypes = new String[fs.length];//类型
            Method[] methods = clazz.getMethods();
            while (rs.next()) {
                for (int i = 0; i < fs.length; i++) {
                    Field f = fs[i];
                    String colName = f.getName().substring(0, 1).toUpperCase()
                            + f.getName().substring(1);
                    colNames[i] = colName;
                    String rType = f.getType().getSimpleName();
                    rTypes[i] = rType;
                }
                Object object = (T) clazz.newInstance();
                for (int i = 0; i < colNames.length; i++) {
                    String colName = colNames[i];
                    String methodName = "set" + colName;
                    // 查找并调用对应的setter方法赋
                    for (Method m : methods) {
                        if (methodName.equals((m.getName()))) {
                            // 如果抛了参数不匹配异常，检查JavaBean中该属性类型，并添加else分支进行处理
                            if ("int".equals(rTypes[i])
                                    || "Integer".equals(rTypes[i])) {
                                m.invoke(object, rs.getInt(colName));
                            } else if ("Date".equals(rTypes[i])) {
                                m.invoke(object, rs.getDate(colName));
                            } else if ("Timestamp".equals(rTypes[i])) {
                                m.invoke(object, rs.getTimestamp(colName));
                            } else if("String".equals(rTypes[i])){
                                m.invoke(object, rs.getString(colName));
                            }else if("long".equals(rTypes[i])){
                                m.invoke(object, rs.getLong(colName));
                            }else if("short".equals(rTypes[i])){
                                m.invoke(object, rs.getShort(colName));
                            } else {
                                m.invoke(object, rs.getObject(colName));
                            }
                            break;
                        }
                    }
                }
                list.add(object);
            }
            if(list.size()!=0){
               return list;}
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbHelper.closeConn(conn, ps, rs);
        }
        return null;
    }

    /**
     * 以对象的形式保存或更新一个实体
     *
     * @param sql
     *            要执行的sql语句
     * @param object
     *            要保存或更新的实体对象
     * @param args
     *            不需要赋值的列标组成的数组，例如sql语句
     *            "insert into tbl_user values(seq_user.nextval,?,?,?)"应为1
     * @return 操作结果，1 成功，0 失败
     * @throws Exception
     */
    public int saveEntity(String sql, Object object, int... args) throws Exception {
        conn = dbHelper.getConn();
        try {
            ps = conn.prepareStatement(sql);
            Class c = object.getClass();
            Field[] fields = object.getClass().getDeclaredFields();
            int temp = 1;// 正赋值的？的下标，最大下标为args的长度
            int colIndex = 1;// SQL语句中的当前字段下标
            int t = 0;// args数组的下标
            for (int j = 0; j < fields.length; j++) {
                Field field = fields[j];// 得到某个声明属性
                String methodName = "get"
                        + field.getName().substring(0, 1).toUpperCase()
                        + field.getName().substring(1);
                Method method = c.getMethod(methodName);// 得到了当前类中的一个method
                String rType = field.getType().getSimpleName().toString();
                if (t < args.length && colIndex == args[t]) {
                    t++;
                } else if ("int".equals(rType) || "INTEGER".equals(rType)) {
                    ps.setInt(temp++, (Integer) method.invoke(object));
                } else {
                    ps.setObject(temp++, method.invoke(object));
                }
                colIndex++;// 更新索引下标
            }
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbHelper.closeConn(conn, ps, null);
        }
        return 0;
    }

    /**
     * 执行可变参数的SQL语句，进行保存、删除或更新操作
     *
     * @param sql
     *            要执行的sql语句，?的赋值顺序必须与args数组的顺序相同
     * @param args
     *            要赋值的参数列表
     * @return 操作结果，正数 成功，0 失败
     * @throws Exception
     */
    public int saveOrUpdate(String sql, Object... args) throws Exception {
        conn = dbHelper.getConn();

        ps = conn.prepareStatement(sql);
        try {
            for (int j = 0; j < args.length; j++) {
            ps.setObject(j + 1, args[j]);
            }
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbHelper.closeConn(conn, ps, null);
        }
        return 0;
    }
}

