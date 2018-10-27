package com.zhenggq.afterclasswork.mybatis.ch01.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Auther: Zhenggq
 * @Date: 2018/10/11 21:49
 * @Description:
 * @Version: 1.0
 */
public class MyTypeHandler extends BaseTypeHandler<String> {

    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {

    }

    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return null;
    }

    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
