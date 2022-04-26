package com.te.array;

import java.util.Scanner;

public class FindingMaximumElementInArray {

	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ArraySize:");
		size=sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int j=0;j<a.length;j++) {
			if(a[j]>max) {
				max=a[j];
			}
		}
		System.out.println("Maximum in an array is:"+max);
	}

}
