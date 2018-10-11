package com.zhenggq.afterclasswork.mybatis.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: Zhenggq
 * @Date: 2018/10/1 10:31
 * @Description:
 * @Version: 1.0
 */
public class ZGQMapperProxy implements InvocationHandler {

    private ZGQSqlSession sqlSession;


    public ZGQMapperProxy(ZGQSqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //获取SQL

        return null;
        // return sqlSession.selectOne();
    }
}
