package com.te.basic;

public class ReverseANumber {

	public static void main(String[] args) {

		int a = 222;
		int rev = 0;
		int rem;
		int temp = a;

		while (a > 0) {

			rem = a % 10;
			a = a / 10;
			rev = rev * 10 + rem;

		}

		System.out.println("Reverse a number:" + rev);
		if (temp == rev)
			System.out.println("your number is pallindrome");
		else
			System.out.println("Your number is not a pallindrome");

	}

}
