package com.te.exception;

public class Arrayexeption {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		int d[] = new int[10];

		try {
			
			d[11]=85;
			int c = a / b;

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception was handled");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Exception was handled");
		}
	}

}

/*
 * Single program can have multiple risky statements i.e, one try block can have
 * multiple exception statement. 
 * • In that case only, one Exception will get
 * caught beacuse one try block can define one exception at a time. • If we want
 * to handle multiple exceptions, it is always recommended to define separate
 * try and catch blocks.
 */
