package com.zhenggq.rpcdemo;/**
 * @Author: Zhenggq
 * @Date: 2018/10/27 11:55
 * @Description:
 * @Version: 1.0
 */

import java.io.Serializable;

/**
 * @Author Zhenggq
 * @Date: 2018/10/27 11:55
 * @Version 1.0
 **/
public class RequestData implements Serializable {


	private static final long serialVersionUID = 1430669128093291248L;

	private String className;
	private String method;
	private Object[] arg;

	public RequestData(String className, String method, Object[] arg) {
		this.className = className;
		this.method = method;
		this.arg = arg;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Object[] getArg() {
		return arg;
	}

	public void setArg(Object[] arg) {
		this.arg = arg;
	}
}
