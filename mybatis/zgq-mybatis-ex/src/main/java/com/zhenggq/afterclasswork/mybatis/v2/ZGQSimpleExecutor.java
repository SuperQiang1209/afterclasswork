package com.zhenggq.afterclasswork.mybatis.v2;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/28 23:46
 * @Description:
 * @Version: 1.0
 */
public class ZGQSimpleExecutor implements ZGQExecutor {

    private ZGQStatementHandler statementHandler;

    public ZGQSimpleExecutor(ZGQStatementHandler statementHandler) {
        this.statementHandler = statementHandler;
    }

    public <T> T query(String statement, String parameter) {
        return (T) statementHandler.handler(statement, parameter);
    }


}
