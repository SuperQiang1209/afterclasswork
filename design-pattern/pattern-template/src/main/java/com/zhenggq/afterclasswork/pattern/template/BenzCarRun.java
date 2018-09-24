package com.zhenggq.afterclasswork.pattern.template;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/23 12:17
 * @Description:
 * @Version: 1.0
 */
public class BenzCarRun extends AbstractCarRun {
    @Override
    public void inKey() {
        System.out.println("插入钥匙");
    }

    @Override
    public void start() {
        System.out.println("发动引擎");
    }

    @Override
    public void speedUp() {
        System.out.println("加速..");
    }

    @Override
    public void stop() {
        System.out.println("停车");
    }
}
