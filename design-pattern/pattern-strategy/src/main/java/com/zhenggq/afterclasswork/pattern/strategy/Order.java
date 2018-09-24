package com.zhenggq.afterclasswork.pattern.strategy;

import com.zhenggq.afterclasswork.pattern.strategy.pay.PayType;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/22 18:49
 * @Description:
 * @Version: 1.0
 */
public class Order {
    String uId;
    String orderId;
    float money;

    public Order(String uId, String orderId, float money) {
        this.uId = uId;
        this.orderId = orderId;
        this.money = money;
    }

    public void pay(PayType type) {
        type.get().pay(this.uId, this.money);
    }
}
