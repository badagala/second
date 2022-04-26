package com.te.array;

public class FindingSecondLargestNumber {

	public static void main(String[] args) {
		int a[] = { 22, 5, 10, 52, 65 };
		int max = a[0];
		int secondmax = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				secondmax = max;
				max = a[i];
			} else if (a[i] > secondmax) {
				secondmax = a[i];

			}
		}
		System.out.println("Maximum Value:" + max);
		System.out.println("Second Maximum value is:" + secondmax);

	}

}
