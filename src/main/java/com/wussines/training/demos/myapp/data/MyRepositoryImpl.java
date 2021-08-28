package com.wussines.training.demos.myapp.data;

public class MyRepositoryImpl implements MyRepository {
	
	@Override
	public void doQuery() {
		System.out.println("Doing DB query!!!");
	}
}
