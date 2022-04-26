package com.te.array;

import java.util.Scanner;

public class FindingMinimumNumberInAnArray {

	public static void main(String[] args) {

		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		size = sc.nextInt();
		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		int min = a[0];
		for (int j = 0; j < a.length; j++) {

			if (a[j] < min) {
				min = a[j];

			}

		}
		System.out.println("The minimum number is:" + min);
	}

}
