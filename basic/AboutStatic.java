package com.te.basic;

public class AboutStatic {
	
	public static int i;
	
	static {
		System.out.println("This is static block");
	}
	
	public static void hello() {
		System.out.println("This is static method");
	}

	public static void main(String[] args) {
		
	AboutStatic.hello();
		

	}

}
