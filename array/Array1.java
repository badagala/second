package com.te.array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		int size;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		size=scan.nextInt();
		
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		
		System.out.println("Your entered Details are:");
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
		

	}

}
