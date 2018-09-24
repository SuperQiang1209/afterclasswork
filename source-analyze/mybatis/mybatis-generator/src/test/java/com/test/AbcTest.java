package com.test;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/24 21:09
 * @Description:
 * @Version: 1.0
 */
public class AbcTest {
    public static void main(String[] args) {
        Abc a = new Abc();

        CountDownLatch c = new CountDownLatch(100);

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {

                try {
                    c.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                a.Go();
            }).start();
            c.countDown();
        }

    }
}
