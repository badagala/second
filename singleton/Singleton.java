package com.te.singleton;

public class Singleton {
	
	private static Singleton single=new Singleton();
	
	private Singleton() {
		
	}

	public static Singleton getSingle() {
		return single;
	}

	public void showMessage() {
		System.out.println("Hello world");
	}
}
