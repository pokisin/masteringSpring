 package com.wussines.training.demos.myapp;

import org.springframework.aop.framework.ProxyFactoryBean;

public class App {

	public static void main(String[] args) throws InterruptedException {
		Person p = new PersonImpl();
		
		ProxyFactoryBean proxyFactory = new ProxyFactoryBean();
		proxyFactory.setTarget(p);
		Object proxy = proxyFactory.getObject();
		
		Person bean = (Person) proxy;
		bean.greet();
	}

}


