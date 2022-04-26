package com.te.methods;

public class Method {
	
	public static void run() {
		System.out.println("running fastly");
	}
	public static void sleep() {
		System.out.println("sleeping");
	}

	public static void main(String[] args) {
		
		run();
		sleep();
		rest();
	}
	public static void rest() {
		System.out.println("take a rest");
	}

}
