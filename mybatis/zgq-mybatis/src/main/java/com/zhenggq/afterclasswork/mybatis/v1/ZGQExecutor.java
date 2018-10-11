package com.zhenggq.afterclasswork.mybatis.v1;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/28 23:17
 * @Description:
 * @Version: 1.0
 */
public interface ZGQExecutor {
    public <T> T query(String statement, String parameter);
}
