package com.te.array;

import java.util.Scanner;

public class SumAndAvgOfAnArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an array number:");
		size = sc.nextInt();
		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}

		int sum = 0;

		for (int j = 0; j < a.length; j++) {
			sum = sum + a[j];
			
		}
		System.out.println("sum of the numbers:" + sum);
		float avg = sum / a.length;
		System.out.println("Avg of the numbers is:" + avg);

	}

}
