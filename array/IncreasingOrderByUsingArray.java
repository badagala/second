package com.te.array;

import java.util.Scanner;

public class IncreasingOrderByUsingArray {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Size Of an Array:");
		size = sc.nextInt();
		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		int temp;
		for (int j = 0; j < a.length; j++) {
			for (int k = 0; k < a.length - 1; k++) {

				if (a[k] > a[k + 1]) {
					temp = a[k];
					a[k] = a[k + 1];
					a[k + 1] = temp;
				}
			}
		}
		for (int m = 0; m < a.length; m++) {
			System.out.println("a[" + m + "]=" + a[m]);
		}

	}

}
