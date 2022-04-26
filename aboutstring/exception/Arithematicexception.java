package com.te.exception;

public class Arithematicexception {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		//int b=5;
		
		int[] d=new int[50];
		
		try {
			int c=a/b;
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic exception was handled");
		}
		try {
			d[100]=100;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array exception was handled");
		}
		
	}

}
