package com.zhenggq.afterclasswork.pattern.factory;

import com.zhenggq.afterclasswork.pattern.factory.impl.BenzCar;
import com.zhenggq.afterclasswork.pattern.factory.impl.BmwCar;
import com.zhenggq.afterclasswork.pattern.factory.impl.FerrariCar;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/21 17:10
 * @Description:
 * @Version: 1.0
 */
public class DefaultCarFactory extends AbstractCarFactory {

    public ICar CreateBenzCar() {
        return new BenzCar();
    }

    public ICar CreateBmwCar() {
        return new BmwCar();
    }

    public ICar CreateFerrariCar() {
        return new FerrariCar();
    }
}
