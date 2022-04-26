package com.te.basic;

public class Pattern5 {

	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++) {
			int a=0;
			
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					a++;
				}
				
			}if(a==2) {
				System.out.println(i+" "+":Number is Prime");
			}
		}

	}

}
