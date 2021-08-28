package com.wussines.training.demos.myapp.business;

import org.springframework.stereotype.Service;
import com.wussines.training.demos.myapp.data.MyRepository;

@Service
public class MyServiceImpl implements MyService {
	
	private MyRepository repository;
	
	public MyServiceImpl(MyRepository repository) {
		this.repository = repository;
	}

	@Override
	public void doBusinessLogic() {
		System.out.println("Doing business logic");
		repository.doQuery();
	}
}
