package com.wussines.training.demos.myapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wussines.training.demos.myapp.MyRepository;
import com.wussines.training.demos.myapp.MyService;

@Configuration
public class AppConfig {
	
	@Bean
	public MyService getService() {
		return new MyService(getRepository());
	}
	
	@Bean
	public MyRepository getRepository() {
		return new MyRepository();
	}
}
