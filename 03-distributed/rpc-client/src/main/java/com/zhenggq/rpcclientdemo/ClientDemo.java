package com.zhenggq.rpcclientdemo;/**
 * @Author: Zhenggq
 * @Date: 2018/10/27 15:59
 * @Description:
 * @Version: 1.0
 */

import com.zhenggq.rpcdemo.IHelloWord;

/**
 * @Author Zhenggq
 * @Date: 2018/10/27 15:59
 * @Version 1.0
 **/
public class ClientDemo {

	public static void main(String[] args) {
		RpcClient client = new RpcClient();
		IHelloWord helloWord = client.clientProxy(IHelloWord.class, "127.0.0.1", 2333);




		System.out.println(helloWord.say("Zhenggq"));
	}


}
