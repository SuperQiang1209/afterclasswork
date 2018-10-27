package com.zhenggq.rimserver.Client;/**
 * @Author: Zhenggq
 * @Date: 2018/10/27 00:09
 * @Description:
 * @Version: 1.0
 */

import com.zhenggq.rimserver.IHelloService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @Author Zhenggq
 * @Date: 2018/10/27 00:09
 * @Version 1.0
 **/
public class ClientDemo {

	public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
		IHelloService helloService = (IHelloService) Naming.lookup("rmi://127.0.0.1/Hello");
		System.out.println(helloService.sayHello("zgq"));


	}
}
