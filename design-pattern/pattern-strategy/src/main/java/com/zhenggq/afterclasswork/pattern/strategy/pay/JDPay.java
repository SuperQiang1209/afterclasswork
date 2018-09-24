package com.zhenggq.afterclasswork.pattern.strategy.pay;

import com.zhenggq.afterclasswork.pattern.strategy.PayState;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/22 18:54
 * @Description:
 * @Version: 1.0
 */
public class JDPay implements IPayMent {
    @Override
    public PayState pay(String uid, float amoun) {
        System.out.println("------京东白条------");
        System.out.println("查询余额中......");
        System.out.println("扣款成功!!");
        return new PayState("200", "交易成功", amoun);
    }
}
