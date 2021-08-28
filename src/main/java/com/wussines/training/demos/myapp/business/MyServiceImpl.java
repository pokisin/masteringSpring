package com.wussines.training.demos.myapp.business;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.wussines.training.demos.myapp.data.MyRepository;

@Service
public class MyServiceImpl implements MyService {
	
	@Value("${my.name}")
	private String name;
	
	
	private MyRepository repository;
	
	public MyServiceImpl(MyRepository repository) {
		this.repository = repository;
	}

	@Override
	public void doBusinessLogic() {
		System.out.println("Doing business logic " + name);
		repository.doQuery();
	}
}
