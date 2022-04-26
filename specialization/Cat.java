package com.te.specialization;

public class Cat implements Animal{

	@Override
	public void sound() {
		System.out.println("Cat sounds like meom meom");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat eats rats");
		
	}

}
