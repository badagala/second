package com.te.basic;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int a=153,rev=0,rem,b=a;
		
		while(a>0) {
			rem=a%10;
			a=a/10;
			rev=rev+(rem*rem*rem);
		}
		System.out.println("Reverse a num is:"+rev);
         if(b==a) {
        	 System.out.println("Armstrong number");
         }else {
        	 System.out.println("Not an Armstrong number");
         }
	}

}
