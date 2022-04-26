package com.te.interfaces;

public class C implements A,B{

	@Override
	public void m2() {
		System.out.println("This is from B interface");
		
	}

	@Override
	public void m1() {
		System.out.println("This is from A interface");
		
	}

}
