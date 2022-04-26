package com.te.array;

import java.util.Scanner;

public class DecreasingOrderInaAnArray {

	public static void main(String[] args) {
		int size;
		System.out.println("Please enter the size of an array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();

		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		int temp;
		for (int j = 0; j < a.length; j++) {
			for (int m = 0; m < a.length - 1; m++) {
				if (a[m] > a[m + 1]) {
					temp = a[m];
					a[m] = a[m + 1];
					a[m + 1] = temp;

				}

			}

		}
		for (int n = 0; n < a.length; n++) {
			System.out.println("a[" + n + "]=" + a[n]);
		}

	}

}
