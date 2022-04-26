package com.te.methods;

public class MethodOverloading {

	public static void main(String[] args) {
		
		add();
		add(100,200);
		add(20,50,60);
		add(50,90,71);
		

	}
	public static void add() {
		System.out.println(10+20+30);
	}
	
	public static void add(int i,int j) {
		System.out.println(i+j);
	}
	public static void add(int i,int j,int k) {
		System.out.println(i+j+k);
	}
	public static void add(int i,int j,int k,int l) {
		System.out.println(i+j+k+l);
	}
	

}
