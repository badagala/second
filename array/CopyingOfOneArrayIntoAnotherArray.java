package com.te.array;

import java.util.Scanner;

public class CopyingOfOneArrayIntoAnotherArray {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		int b[]=new int[a.length];
		for(int j=0;j<a.length;j++) {
			b[j]=a[j];
		}
		for(int k=0;k<a.length;k++) {
			System.out.println("b["+k+"]"+b[k]);
		}

	}

}
