package com.te.generalization;

public class Monkey implements Animal{

	@Override
	public void sleep() {
		System.out.println("Monkey is sleeping");
		
	}

	@Override
	public void eat() {
		System.out.println("Monkey is eating");
		
	}

}
