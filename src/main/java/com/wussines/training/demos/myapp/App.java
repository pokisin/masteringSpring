 package com.wussines.training.demos.myapp;

public class App {

	public static void main(String[] args) throws InterruptedException {
		Person p = (Person) TimestampLogginProxy.getProxy(new PersonImpl());
		p.greet();
		Thread.sleep(2000);
		p.greetInEnglish();
	}

}


