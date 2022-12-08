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
}
