package com.te.array;

import java.util.Scanner;

public class PrintingFirstandLastElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of a array:");
		size = sc.nextInt();
		int k[] = new int[size];

		for (int i = 0; i < k.length; i++) {

			k[i] = sc.nextInt();
			
			System.out.println(k[0]);
			System.out.println(k[k.length - 1]);
			

		}
	}

}
