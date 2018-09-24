package com.zhenggq.afterclasswork.pattern.strategy;

import com.zhenggq.afterclasswork.pattern.strategy.pay.PayType;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/22 19:04
 * @Description:
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order("742009005", "201809220010000002", 245.66f);

        order.pay(PayType.get("Jd"));

        order.pay(PayType.UNIONPay);
    }


    public void test(){

    }
}
