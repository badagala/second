package com.te.specialization;

public class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("Dog sounds like bow bow");
		
	}

	@Override
	public void eat() {
		System.out.println("It eats chicken ");
		
	}

}
