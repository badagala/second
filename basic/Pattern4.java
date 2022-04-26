package com.te.basic;

public class Pattern4 {

	public static void main(String[] args) {
		
		int a=3;
		int b=0;
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=a;j++) {
				System.out.print("*");
			}if(i<=3) {
				a=a+1;
			}else {
				a=a-1;
			}System.out.println("");
		}

	}

}
