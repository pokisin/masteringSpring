package com.wussines.training.demos.myapp;

public class Proxy implements Person{
	
	private Person delegate;
	
	public Proxy(Person delegate) {
		this.delegate = delegate;
	}

	@Override
	public void greet() {
		interceptor();
		delegate.greet();
	}

	@Override
	public void greetInEnglish() {
		interceptor();
		delegate.greetInEnglish();
	}
	
	private void interceptor() {
		System.out.println("Te observo que haces...");
	}
}
