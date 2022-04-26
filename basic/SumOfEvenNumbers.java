package com.te.basic;

public class SumOfEvenNumbers {
	
	public static void main(String[] args) {
		int a=0;
		
		for(int i=1;i<=100;i++) {
			
			if(i%2==0) {
				//System.out.println("Priting Even Number");
				System.out.println(i);
				//System.out.println("After adding even numbers:");
				a=a+i;
				System.out.println("After adding even numbers:"+a);
				
			}
		}
		

	}
}
