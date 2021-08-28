 package com.wussines.training.demos.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wussines.training.demos.myapp.business.MyService;
import com.wussines.training.demos.myapp.config.AppConfig;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		MyService bean = ctx.getBean(MyService.class);
		bean.doBusinessLogic();
		
		//MyRepository repository = ctx.getBean(MyRepository.class);
		//repository.doQuery();
	}

}


