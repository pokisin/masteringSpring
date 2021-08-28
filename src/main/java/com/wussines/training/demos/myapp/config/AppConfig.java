package com.wussines.training.demos.myapp.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

@Configuration
@ComponentScan("com.wussines.training.demos.myapp")
public class AppConfig {
	
	@Bean
	public DataSource dataSource() {
		SingleConnectionDataSource dataSource = new SingleConnectionDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/easy_nom?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		
		return dataSource;
	}
}
