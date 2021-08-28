package com.wussines.training.demos.myapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.wussines.training.demos.myapp.business.MyService;
import com.wussines.training.demos.myapp.business.MyServiceImpl;
import com.wussines.training.demos.myapp.data.MyRepository;
import com.wussines.training.demos.myapp.data.OtherRepository;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {
	
	@Bean
	@Scope("prototype")
	public MyService getService() {
		return new MyServiceImpl(getRepository());
	}
	
	@Bean
	public MyRepository getRepository() {
		return new OtherRepository();
	}
}
