package com.te.exception;

public class AboutFinally {

	public static void main(String[] args) {
		div();

	}

	public static void div() {
		int i = 20;
		int j = 0;
		int[] d = new int[20];

		try {
			System.out.println("Executing try block");
			int k = i / j;
			System.out.println("Handled Arithmetic Exception");
			
			d[120] = 220;
			System.out.println("Handled Array exception");

		} catch (Exception e) {
			System.out.println("Exception was handled successfully");

		} finally {

			System.out.println("Entering and executing Finally block");
		}
	}
}
