package com.te.aboutsuper;

public class B extends A{
	
	public void m1() {
		System.out.println("This method from B-class m1 method");
	}
 
	public void m2() {
		System.out.println("This method from B-class m2 method");
		super.m1();
	}
}
