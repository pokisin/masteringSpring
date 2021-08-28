package com.wussines.training.demos.myapp;

public class Proxy implements Person{
	
	private Person delegate;
	
	public Proxy(Person delegate) {
		this.delegate = delegate;
	}

	@Override
	public void greet() {
		System.out.println("Tengo que hacer algo antes de que ejecutes la función...");
		delegate.greet();
	}

}
