package com.zhenggq.afterclasswork.mybatis.v1;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/28 21:55
 * @Description:
 * @Version: 1.0
 */
public interface ZGQSqlSession {

    <T> T getMapper(Class<T> clazz, ZGQSqlSession sqlSession);

    <T> T selectOne(String statement, String parameter);

}
