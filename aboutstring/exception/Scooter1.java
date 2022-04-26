package com.te.exception;

public class Scooter1 {

	public static void div() {
		int a = 40;
		int b = 0;

		try {
			System.out.println("Starting try block");// executed
			int c = a / b;
			System.out.println("try block");// unexecuted

		} catch (ArithmeticException e) {

			System.out.println("Exception is occured and handled");// executed

		}
	}

	public static void main(String[] args) {

		div();
		System.out.println("Completed handling exception");// executed

	}

}

/*
 * • try block is used to keep a code which causes an exception. • Once
 * Exception occured in try block remaining part of code from try block will not
 * be executed. So, we should keep only statements which causes exception under
 * try block. • Once exception occurred in try block, JVM immediately make a
 * search for corresponding catch block. • Catch block is where we will caught
 * the exception. • Under catch block we provide some statements which works as
 * alternate solution for Exception.
 */