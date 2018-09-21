package com.zhenggq.afterclasswork.pattern.factory.extend;

/**
 * 奔驰汽车
 *
 * @Author: Zhenggq
 * @Date: 2018/9/21 17:20
 * @Description:
 * @Version: 1.0
 */
public abstract class AbstractBenzCar implements ICar {

    public String brand() {
        return "奔驰";
    }

    public abstract String color();

    @Override
    public String toString() {
        return this.color() + this.brand();
    }
}
