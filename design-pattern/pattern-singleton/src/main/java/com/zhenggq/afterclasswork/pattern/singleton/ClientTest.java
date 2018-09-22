package com.zhenggq.afterclasswork.pattern.singleton;

import java.io.*;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/21 22:17
 * @Description:
 * @Version: 1.0
 */
public class ClientTest {

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(100);

        for (int i = 0; i < 200; i++) {

            new Thread(() -> {
                System.out.println(System.currentTimeMillis() + "--------" + JerrySingleton.getInstance());
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

            latch.countDown();
        }


        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            JerrySingleton.getInstance();
        }
        System.out.println(System.currentTimeMillis() - start + "--------------------total");

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            Example01.getInstance();
        }
        System.out.println(System.currentTimeMillis() - start + "--------------------total");


        try {
            JerrySingleton jerry = JerrySingleton.getInstance();
            System.out.println(jerry);

            FileOutputStream fos = new FileOutputStream("jerry");
            ObjectOutput out = new ObjectOutputStream(fos);
            out.writeObject(jerry);

            FileInputStream fis = new FileInputStream("jerry");
            ObjectInputStream ois = new ObjectInputStream(fis);
            JerrySingleton object = (JerrySingleton) ois.readObject();

            System.out.println(object);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
