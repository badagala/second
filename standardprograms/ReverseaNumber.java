package com.te.standardprograms;

public class ReverseaNumber {

	public static void main(String[] args) {

		int i = 349846;
		int rem ;
		int rev =0;

		while (i > 0) {
			rem = i % 10;
			i = i / 10;
			rev = rev * 10 + rem;
		}
		System.out.println("Reverse a number is:" + rev);
	}

}
