package com.zhenggq.rimserver.impl;/**
 * @Author: Zhenggq
 * @Date: 2018/10/27 00:07
 * @Description:
 * @Version: 1.0
 */

import com.zhenggq.rimserver.IHelloService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Author Zhenggq
 * @Date: 2018/10/27 00:07
 * @Version 1.0
 **/
public class HelloServiceImpl extends UnicastRemoteObject implements IHelloService {


	protected HelloServiceImpl() throws RemoteException {
		super();
	}

	public String sayHello(String msg) throws RemoteException{
		return "Hello," + msg;
	}
}
