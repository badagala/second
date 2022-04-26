package com.te.overriding;

public class Main1 {

	public static void main(String[] args) {
		A a =new A();
		a.m1();
		B b=new B();
		b.m1();
		b.m2();
		A a1=new B();
		a.m1();
		Object obj=new A();
		//obj.
	}

}
