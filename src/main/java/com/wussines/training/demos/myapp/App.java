 package com.wussines.training.demos.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext("com.wussines.training.demos.myapp");
		MyService bean = ctx.getBean(MyService.class);
		bean.doBusinessLogic();
		
		//MyRepository repository = ctx.getBean(MyRepository.class);
		//repository.doQuery();
	}

}


