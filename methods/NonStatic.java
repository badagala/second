package com.te.methods;

public class NonStatic {
	
	public static void run() {
		
		System.out.println("running safely");
	}
	String freely="viswa has no tension he will feel free in everytime";
	String eating="Lokesh is eating but there is no gain of his energy";
	String dancing="Poojari walks like an dancer";
	String chatting="Vijay is full busy with his mobile phone";
	String sitting ="Raviteja is sitting on a wall";
	
	public  void free() {
		run();
		System.out.println("he is freely:"+freely);
		System.out.println("he is eating:"+eating);
		System.out.println("he is dancing:"+dancing);
		System.out.println("he is sitting:"+sitting);
		System.out.println("he is chatting:"+chatting);
	}

	public static void main(String[] args) {
		
		
		NonStatic stat= new NonStatic();
		stat.free();
		stat.run();
		stat.cut();
		
		}
	
	public static void cut() {
		
		run();
		
		System.out.println("he is cutting vegetables");

	}

}
