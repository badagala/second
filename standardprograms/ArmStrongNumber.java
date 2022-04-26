package com.te.standardprograms;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int n=455;
		int rem;
	    int rev=0;
	    int a=n;
	    
	    while(n>0) {
	    	rem=n%10;
	    	n=n/10;
	    	rev=rev+(rem*rem*rem);
	    }
	    System.out.println("Reverse a number is:"+rev);
	    
	    if(a==n) {
	    	System.out.println("Given number is armstrong Number");
	    }else {
	    	System.out.println("Not an armstrong number");
	    }

	}

}
