package com.zhenggq.afterclasswork.pattern.strategy.pay;

import com.zhenggq.afterclasswork.pattern.strategy.PayState;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/22 18:48
 * @Description:
 * @Version: 1.0
 */
public interface IPayMent {
    PayState pay(String uid, float amount);
}
