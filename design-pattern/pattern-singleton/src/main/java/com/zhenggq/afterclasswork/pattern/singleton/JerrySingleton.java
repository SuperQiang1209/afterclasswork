package com.zhenggq.afterclasswork.pattern.singleton;

import java.io.Serializable;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/21 22:14
 * @Description:
 * @Version: 1.0
 */
public class JerrySingleton implements Serializable {

    private JerrySingleton() {
    }

    private static JerrySingleton jerry = null;

    static {
        jerry = new JerrySingleton();
    }

    public static JerrySingleton getInstance() {
        return jerry;
    }

    private Object readResolve() {
        return jerry;
    }


}
