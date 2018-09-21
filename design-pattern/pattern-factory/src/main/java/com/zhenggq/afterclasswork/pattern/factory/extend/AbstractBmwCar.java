package com.zhenggq.afterclasswork.pattern.factory.extend;

/**
 * 宝马汽车
 *
 * @Author: Zhenggq
 * @Date: 2018/9/21 17:23
 * @Description:
 * @Version: 1.0
 */
public abstract class AbstractBmwCar implements ICar {

    public String brand() {
        return "宝马";
    }

    public abstract String color();

    @Override
    public String toString() {
        return this.color() + this.brand();
    }
}
