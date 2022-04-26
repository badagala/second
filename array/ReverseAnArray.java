package com.te.array;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {

		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of an array:");
		size = sc.nextInt();
		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int j = a.length-1;j>=0;j--) {
			System.out.println("Reversing the values in an array:" + a[j]);
		}

	}

}
