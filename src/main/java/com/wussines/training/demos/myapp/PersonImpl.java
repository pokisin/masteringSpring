package com.wussines.training.demos.myapp;

public class PersonImpl implements Person {
	
	@Override
	public void greet() {
		System.out.println("Hola soy un objeto persona");
	}

	@Override
	public void greetInEnglish() {
		System.out.println("Hi from United State");
	}
}
