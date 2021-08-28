 package com.wussines.training.demos.myapp;

public class App {

	public static void main(String[] args) {
		Person p = new Proxy(new PersonImpl());
		p.greet();
		p.greetInEnglish();
	}

}


