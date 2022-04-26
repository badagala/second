package com.te.array;

public class FindingMaxNumberFromArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=5;
		a[2]=15;
		a[3]=2;
		a[4]=18;
		
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			/*
			 * if(a[i]>max) { max=a[i]; }
			 */
			if(a[i]<min) {
				min=a[i];
			}
			
		}
		System.out.println("The max number in an array is:"+min);

	}

}
