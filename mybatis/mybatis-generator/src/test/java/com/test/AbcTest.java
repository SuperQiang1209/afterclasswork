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
        System.out.println(2 << 3);

        int p = 12;
        int o = 6;

        p = p + o;
        o = p - o;
        p = p - o;

        System.out.println("p:" + p + ",o:" + o);


        p = 12;
        o = 6;

        p = p ^ o;
        o = p ^ o;
        p = o ^ p;

        System.out.println("p:" + p + ",o:" + o);

        p = 12;
        o = 6;

        p = (p + o) - (o = p);

        System.out.println("p:" + p + ",o:" + o);

        p = 12;
        o = 6;
        int sum = p + ++o;
        System.out.println("p:" + p + ",o:" + o + "sum:" + sum);

        p = 12;
        o = 6;
        sum = p++ + o;
        System.out.println("p:" + p + ",o:" + o + "sum:" + sum);

        System.out.println(~10 + "|" + ~-12 + "|" + ~14);
        System.out.println(16 >> 3);
        System.out.println(-16 >> 3);
        System.out.println(Integer.toBinaryString(16));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(-Integer.MAX_VALUE));
        System.out.println("===========================");
        System.out.println(Integer.toBinaryString(3));//011
        System.out.println(Integer.toBinaryString(~3));//100
        System.out.println(Integer.toBinaryString(3 << 2));//011
        System.out.println("10 >> 1:"+Integer.toBinaryString(10 >> 1));//011
        System.out.println("===========================");
        System.out.println(Integer.toBinaryString(-3));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(16 >>> 16);


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
