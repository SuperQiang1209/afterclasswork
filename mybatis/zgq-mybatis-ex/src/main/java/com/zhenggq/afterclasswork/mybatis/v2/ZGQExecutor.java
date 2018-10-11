package com.zhenggq.afterclasswork.mybatis.v2;

/**
 * @Auther: Zhenggq
 * @Date: 2018/10/1 10:37
 * @Description:
 * @Version: 1.0
 */
public interface ZGQExecutor {

    public <T> T query(String statement, String parameter);
}
