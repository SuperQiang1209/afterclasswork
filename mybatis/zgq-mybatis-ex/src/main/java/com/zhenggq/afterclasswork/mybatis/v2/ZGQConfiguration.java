package com.zhenggq.afterclasswork.mybatis.v2;

import java.lang.reflect.Proxy;

/**
 * @Auther: Zhenggq
 * @Date: 2018/10/1 10:18
 * @Description:
 * @Version: 1.0
 */
public class ZGQConfiguration {

    private ZGQMapperRegister mapperRegister;

    public ZGQConfiguration(String mapperPackage) {
        mapperRegister = new ZGQMapperRegister(mapperPackage);
    }

    public <T> T getMapper(Class<T> clazz, ZGQSqlSession sqlSession) {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{clazz}, new ZGQMapperProxy(sqlSession));
    }


}
