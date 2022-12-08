package com.atguigu.util;


import java.sql.*;

/*
JDBC工具类 用来建立连接和释放连接
 */
public class JDBCTools {


    public static Connection getSqlServerConnection(String url,String user,String password) throws Exception {// 连接sqlserver数据库
        String driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//        String url = "jdbc:sqlserver://192.168.102.122:1433;DatabaseName=v3xuser";
//        String user = "sa";
//        String password = "qwe123";
//        String url = "jdbc:sqlserver://192.168.102.122:1433;DatabaseName=v3xuser";
//        String user = "sa";
//        String password = "qwe123";
        Class.forName(driverClass);
        return DriverManager.getConnection(url, user, password);
    }

    public static Connection getMysqlConnection(String url,String user,String password) throws Exception {// 连接mysql数据库
        String driverClass = "com.mysql.jdbc.Driver";
//        String url = "jdbc:mysql://127.0.0.1:3306/fcms?characterEncoding=utf-8";
//        String user = "root";
//        String password = "Seeyou123456";
        Class.forName(driverClass);
        return DriverManager.getConnection(url, user, password);
    }

    public static Connection getOracleConnection() throws Exception {// 连接Oracle数据库
        String driverClass = System.getProperty("customize_trigger.driverClass");
        String url = System.getProperty("customize_trigger.url");
        String user = System.getProperty("customize_trigger.user");
        String password = System.getProperty("customize_trigger.password");
        Class.forName(driverClass);
        return DriverManager.getConnection(url, user, password);
    }

    public static void release(Connection con, Statement state) {// 关闭数据库连接
        if (state != null) {
            try {
                state.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void release(ResultSet rs, Connection con, Statement state) {// 关闭数据库连接
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (state != null) {
            try {
                state.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 查询demo
     */
    private void demoQueryTest(){
        PreparedStatement statement = null ;
        Connection conn = null;
        ResultSet rs = null;
        try {
            
            String sql = "SELECT orderId,pendingTitle,senderId,senderName,receiverId,pendingUrl,startTime  FROM t_hr_task_view WHERE pendingStatus=0 AND receiverId = ?;";

            statement = conn.prepareStatement(sql);
            statement.setString(1, "23423");

            rs = statement.executeQuery();

            //结果集循环遍历结果
            while (rs.next()){
                String taskId = rs.getString(1);//结果的第一个字段值
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 插入数据demo
     */
    private void insertDemoTest(){
        PreparedStatement statement = null ;
        Connection conn = null;
        ResultSet rs = null;
        try {

            String insertMidOaType = "INSERT INTO d_mid_oa_type (id,oa_type_name,fond_code) VALUES (?,?,?)";//OA类型表

            statement = conn.prepareStatement(insertMidOaType);
            statement.setString(1, "");
            statement.setString(2, "");
            statement.setString(3, "");
            statement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
