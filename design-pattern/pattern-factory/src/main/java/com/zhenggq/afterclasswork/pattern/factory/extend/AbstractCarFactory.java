package com.zhenggq.afterclasswork.pattern.factory.extend;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/21 17:05
 * @Description:
 * @Version: 1.0
 */
public abstract class AbstractCarFactory {

    public abstract AbstractBenzCar CreateRedBenzCar();

    public abstract AbstractBenzCar CreateBlackBenzCar();

    public abstract AbstractBmwCar CreateRedBmwCar();

    public abstract AbstractBmwCar CreateBlackBmwCar();

    public abstract AbstractFerrariCar CreateRedFerrariCar();

    public abstract AbstractFerrariCar CreateBlackFerrariCar();

}
