package com.zhenggq.afterclasswork.pattern.factory;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/21 17:11
 * @Description:
 * @Version: 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        DefaultCarFactory factory = new DefaultCarFactory();
        ICar benz = factory.CreateBenzCar();
        ICar bmw = factory.CreateBmwCar();
        ICar ferrari = factory.CreateFerrariCar();

        print(benz);
        print(bmw);
        print(ferrari);
    }

    public static void print(ICar car) {
        System.out.println(car.color() + car.brand());
    }

}
