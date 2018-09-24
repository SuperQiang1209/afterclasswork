package com.zhenggq.afterclasswork.pattern.template;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/23 12:16
 * @Description:
 * @Version: 1.0
 */
public abstract class AbstractCarRun implements ICarRun {

    public void run() {
        this.inKey();
        this.start();
        this.speedUp();
        this.stop();
    }
}
