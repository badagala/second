package com.te.array;

public class SecondSmallestNumberInAnArray {

	public static void main(String[] args) {
		int a[] = { 20, 50, 60, 5, 40, 10 };
		int min = a[0];
		int secondminnumber = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				a[i] = secondminnumber;
			} else if (a[i] < secondminnumber) {
				secondminnumber = a[i];

			}

		}
		System.out.println("Minimum number is:" + min);
		System.out.println("Second Minimum Number is:" + secondminnumber);

	}

}
