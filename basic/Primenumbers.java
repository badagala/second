package com.te.basic;

import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {

		System.out.println("Enter the prime number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (isprime(a)) {
			System.out.println(a + "Prime number");

		} else {
			System.out.println(a + "not a prime number");
		}

	}

	public static boolean isprime(int a) {

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
