 package com.wussines.training.demos.myapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wussines.training.demos.myapp.config.AppConfig;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args){
		new AnnotationConfigApplicationContext(AppConfig.class);
	}

}


