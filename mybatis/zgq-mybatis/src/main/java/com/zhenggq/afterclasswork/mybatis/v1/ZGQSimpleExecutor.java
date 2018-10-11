package com.zhenggq.afterclasswork.mybatis.v1;

import com.zhenggq.afterclasswork.mybatis.v1.Test.User;

import java.sql.*;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/28 23:46
 * @Description:
 * @Version: 1.0
 */
public class ZGQSimpleExecutor implements ZGQExecutor {

    public <T> T query(String statement, String parameter) {

        Connection conn = getConn();
        String sql = String.format(statement, Integer.parseInt(parameter));
        PreparedStatement pstmt;
        User user = null;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            //  pstmt.setInt(1, Integer.parseInt(parameter));
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                user = new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setAge(rs.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (T) user;
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
