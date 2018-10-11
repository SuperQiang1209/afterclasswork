package com.zhenggq.afterclasswork.mybatis.v1;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/28 22:05
 * @Description:
 * @Version: 1.0
 */
public class ZGQDefaultSqlSession implements ZGQSqlSession {

    private ZGQExecutor executor;
    private ZGQConfiguration configuration;

    public ZGQDefaultSqlSession(ZGQConfiguration configuration, ZGQExecutor executor) {
        this.executor = executor;
        this.configuration = configuration;
    }

    public <T> T getMapper(Class<T> clazz, ZGQSqlSession sqlSession) {
        return configuration.getMapper(clazz, sqlSession);
    }

    public <T> T selectOne(String statement, String parameter) {
        return executor.query(statement, parameter);
    }
}
