package com.zhenggq.afterclasswork.pattern.factory.extend;

import com.zhenggq.afterclasswork.pattern.factory.extend.impl.*;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/21 17:32
 * @Description:
 * @Version: 1.0
 */
public class DefaultCarFactory extends AbstractCarFactory {


    public AbstractBenzCar CreateRedBenzCar() {
        return new RedBenzCar();
    }

    public AbstractBenzCar CreateBlackBenzCar() {
        return new BlackBenzCar();
    }

    public AbstractBmwCar CreateRedBmwCar() {
        return new RedBmwCar();
    }

    public AbstractBmwCar CreateBlackBmwCar() {
        return new BlackBmwCar();
    }

    public AbstractFerrariCar CreateRedFerrariCar() {
        return new RedFerrariCar();
    }

    public AbstractFerrariCar CreateBlackFerrariCar() {
        return new BlackFerrariCar();
    }
}
