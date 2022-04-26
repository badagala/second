package com.te.standardprograms;

public class Palendrome {

	public static void main(String[] args) {

		int i = 5555;
		int rem;
		int rev = 0;
		int temp = i;

		while (i > 0) {
			rem = i % 10;
			i = i / 10;
			rev = rev * 10 + rem;
		}

		System.out.println(rev);
		if (temp == rev) {
			System.out.println("Number is a palindrome");
		} else {
			System.out.println("Not a palindrome number");
		}
	}

}
//palindrome means the number or a word which would be same after reversing the number or a word