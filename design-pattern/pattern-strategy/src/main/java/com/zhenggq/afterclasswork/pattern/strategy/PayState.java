package com.zhenggq.afterclasswork.pattern.strategy;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/22 18:49
 * @Description:
 * @Version: 1.0
 */
public class PayState {
    private String code;
    private String msg;
    private Object data;

    public PayState(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "交易结果:[" + code + "]," + msg + "交易详情:" + data;
    }
}
