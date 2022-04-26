package com.te.aboutfinal;
//final variable------->cannot be changed but must be intialised during declaration 
//final method-------->cannot be overridden but can be inherited 
//final class--------->cannot be inherited

public class Pen {

	public final static int i=10;
	public final static String s="vijay";
	int i1=20;
	String s1="Loki";
	
	public static void main(String[] args) {
		int i=20;
		String s="Swamy";
		System.out.println(i);
		System.out.println(s);
		write();
		ink();
		Pen p=new Pen();
		p.i1=20;
		p.s1="ravi";
		
	}
	public final static void write() {
		System.out.println("Parkar pen");
	}
	public final static void ink() {
		System.out.println("Bue ink");
	}
}
