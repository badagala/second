package com.te.methods;

public class ConstructorChaining {
	
	public ConstructorChaining() {//default constructor
		this(100,200);
		System.out.println("Calling default constructor");
	}
	public ConstructorChaining(int i,int j) {
		this(400.00,520.62);
		System.out.println("calling parametrized constructor");
		System.out.println("result of int is:"+(i+j));
		
	}
	public ConstructorChaining(double d,double f)
	{
		System.out.println("calling 2 constructor");
		System.out.println("Result of double is:"+(d+f));
	}
	public static void main(String[] args) {
		
		ConstructorChaining chain=new ConstructorChaining();
		

	}

}
