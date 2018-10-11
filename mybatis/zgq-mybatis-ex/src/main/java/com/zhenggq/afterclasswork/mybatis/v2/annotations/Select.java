package com.zhenggq.afterclasswork.mybatis.v2.annotations;

import java.lang.annotation.*;

/**
 * @Auther: Zhenggq
 * @Date: 2018/10/1 11:13
 * @Description:
 * @Version: 1.0
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Select {
    String value();
}
