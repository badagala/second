package com.te.generalization;

public class Cat implements Animal{

	@Override
	public void sleep() {
		System.out.println("Cat is sleeping");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat is eating");
		
	}

}
