package com.zhenggq.afterclasswork.mybatis.v2;

import java.sql.*;

/**
 * @Auther: Zhenggq
 * @Date: 2018/10/1 11:11
 * @Description:
 * @Version: 1.0
 */
public class ZGQStatementHandler {

    private ZGQResultSetHandler resultSetHandler;

    public <T> T handler(String statement, String parameter) {
        Connection conn = getConn();
        String sql = String.format(statement, Integer.parseInt(parameter));
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            ZGQResultSetHandler resultSetHandler = new ZGQResultSetHandler();
            resultSetHandler.handler(rs, null);
            return (T) rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static Connection getConn() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://184.170.220.151:3306/zhenggq";
        String username = "root";
        String password = "root";
        Connection conn = null;
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
