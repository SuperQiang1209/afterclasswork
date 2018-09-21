package com.zhenggq.afterclasswork.pattern.factory.extend;

/**
 * 法拉利
 *
 * @Author: Zhenggq
 * @Date: 2018/9/21 17:24
 * @Description:
 * @Version: 1.0
 */
public abstract class AbstractFerrariCar implements ICar {

    public String brand() {
        return "法拉利";
    }

    public abstract String color();

    @Override
    public String toString() {
        return this.color() + this.brand();
    }
}
