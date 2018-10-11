package com.zhenggq.afterclasswork.mybatis.v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/28 23:24
 * @Description:
 * @Version: 1.0
 */
public class ZGQMapperProxy implements InvocationHandler {


    private ZGQSqlSession sqlSession;

    public ZGQMapperProxy(ZGQSqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getDeclaringClass().getName().equals(ZGQConfiguration.TestMapperXML.nameSpace)) {
            String sql = ZGQConfiguration.TestMapperXML.methodSqlMapping.get(method.getName());
            return sqlSession.selectOne(sql, String.valueOf(args[0]));
        } else {
            return method.invoke(this, method, args);
        }
    }
}
