package com.zhenggq.rpcdemo;

/**
 * @Author Zhenggq
 * @Date: 2018/10/27 10:54
 * @Version 1.0
 **/
public class HelloWordImpl implements IHelloWord {


	public String say(String msg) {
		return msg + ",say:HelloWord!!";
	}
}
