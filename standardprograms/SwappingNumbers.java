package com.te.standardprograms;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		int a=10,b=20;
		
		System.out.println("Before swaping values are:"+a+" "+b);
		//logic -1  using third variable
		int t=a;
		a=b;
		b=t;
		
		
		//logic-2  using + & - without using third variable
		
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		
		
		//logic-3 using * & / without using third variable and here a & b values should not be zero
		
		a=a*b;//10*20=200
		b=a/b;//200/20=10
		a=a/b;//200/10=20
		
		System.out.println("After swaping values are:"+a+" "+b);

	}

}
