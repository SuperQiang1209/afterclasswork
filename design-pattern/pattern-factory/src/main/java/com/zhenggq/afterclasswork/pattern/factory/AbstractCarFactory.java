package com.zhenggq.afterclasswork.pattern.factory;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/21 17:05
 * @Description:
 * @Version: 1.0
 */
public abstract class AbstractCarFactory {

    public abstract ICar CreateBenzCar();

    public abstract ICar CreateBmwCar();

    public abstract ICar CreateFerrariCar();

}
