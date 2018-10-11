package com.zhenggq.afterclasswork.mybatis.v2;

/**
 * @Auther: Zhenggq
 * @Date: 2018/10/1 10:18
 * @Description:
 * @Version: 1.0
 */
public class ZGQSqlSession {

    private ZGQConfiguration configuration;

    private ZGQExecutor executor;

    public ZGQSqlSession(ZGQConfiguration configuration, ZGQExecutor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    public <T> T getMapper(Class<T> clazz) {
        return configuration.getMapper(clazz, this);
    }

    public <T> T selectOne(String statement, String parameter) {
        return executor.query(statement, parameter);
    }

}
