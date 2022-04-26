package com.te.basic;

public class ProductOfEvenNumbers {

	public static void main(String[] args) {
		
		int a=1;
		
		for(int i=0;i<=50;i++) {
			if(i%2==0) {
				//System.out.println(i);
				//System.out.println("Product of numbers:");
				a=i*i;
				System.out.println("product of:"+a);
			}
			
		}

	}

}
