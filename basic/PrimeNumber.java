package com.te.basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Please enter the number");

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (isPrime(a)) {
			
			System.out.println(a + "is a prime number");
			
		} else {
			
			System.out.println(a + "not a prime number");
		}

	}

	private static boolean isPrime(int a) {
		if (a <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(a); i++) {

			if (a % i == 0) {
				return false;
			}

		}

		return true;
	}
}
