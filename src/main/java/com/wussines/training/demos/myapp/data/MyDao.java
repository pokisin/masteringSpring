package com.wussines.training.demos.myapp.data;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyDao {
	
	private DataSource datasource;
	
	@Autowired
	public MyDao(DataSource datasource) {
		this.datasource = datasource;
	}
	
	
}
