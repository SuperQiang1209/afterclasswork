package com.zhenggq.afterclasswork.pattern.factory.extend;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/21 17:50
 * @Description:
 * @Version: 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        AbstractCarFactory factory = new DefaultCarFactory();

        AbstractBenzCar redBenz = factory.CreateRedBenzCar();
        AbstractBenzCar blackBenz = factory.CreateBlackBenzCar();

        AbstractBmwCar redBmw =   factory.CreateRedBmwCar();
        AbstractBmwCar blackBmw =  factory.CreateBlackBmwCar();

        AbstractFerrariCar redFerrari = factory.CreateRedFerrariCar();
        AbstractFerrariCar blackFerrari = factory.CreateBlackFerrariCar();

        System.out.println(redBenz);
        System.out.println(blackBenz);
        System.out.println(redBmw);
        System.out.println(blackBmw);
        System.out.println(redFerrari);
        System.out.println(blackFerrari);
    }
}
