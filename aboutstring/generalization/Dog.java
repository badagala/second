package com.te.generalization;

public class Dog implements Animal{

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating");
		
	}

}
