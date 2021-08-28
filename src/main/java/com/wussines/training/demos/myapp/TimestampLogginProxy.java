package com.wussines.training.demos.myapp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class TimestampLogginProxy implements InvocationHandler{
	
	private Object delegate;	
	
	public TimestampLogginProxy(Object delegate) {
		this.delegate = delegate;
	}
	
	public static Object getProxy(Object o) {
		return Proxy.newProxyInstance(
				o.getClass().getClassLoader(), 
				o.getClass().getInterfaces(),
				new TimestampLogginProxy(o));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(new Date());
		return method.invoke(delegate, args);
	}

}
