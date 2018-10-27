package com.zhenggq.rpcdemo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;

/**
 * @Author: Zhenggq
 * @Date: 2018/10/27 15:46
 * @Description:
 * @Version: 1.0
 */
public class ProcessorHandler implements Runnable {


	private Object service;
	private Socket socket;

	public ProcessorHandler(Socket socket, Object service) {
		this.service = service;
		this.socket = socket;
	}

	public void run() {
		ObjectInputStream inputStream = null;
		ObjectOutputStream outputStream = null;
		try {
			inputStream = new ObjectInputStream(socket.getInputStream());
			RequestData request = (RequestData) inputStream.readObject();
			Object result = invoke(request);

			outputStream = new ObjectOutputStream(socket.getOutputStream());
			outputStream.writeObject(result);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (null != inputStream) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (null != outputStream) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}


	}

	private Object invoke(RequestData request) {
		try {
			String methodName = request.getMethod();
			Object args[] = request.getArg();
			Class<?> parameterTypes[] = new Class[args.length];
			for (int i = 0; i < args.length; i++) {
				parameterTypes[i] = args[i].getClass();
			}
			Method method = service.getClass().getMethod(methodName, parameterTypes);
			return method.invoke(service, args);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		return null;
	}
}
