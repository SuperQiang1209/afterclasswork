package com.zhenggq.afterclasswork.mybatis.v1;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/28 23:17
 * @Description:
 * @Version: 1.0
 */
public class ZGQConfiguration {

    public <T> T getMapper(Class<T> clazz, ZGQSqlSession sqlSession) {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{clazz}, new ZGQMapperProxy(sqlSession));
    }

    /**
     * 模拟XML解析
     */
    static class TestMapperXML {
        public static final String nameSpace = "com.zhenggq.afterclasswork.mybatis.v1.Test.UserMapper";

        public static final Map<String, String> methodSqlMapping = new HashMap<String, String>();

        static {
            methodSqlMapping.put("selectByPrimaryKey", "SELECT * FROM user where id = %d");
        }

    }

}
