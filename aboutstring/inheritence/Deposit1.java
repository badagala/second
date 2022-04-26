package com.te.inheritence;

public class Deposit1 extends Bank2{
	
	double amt=1000;
	
	public void deposit() {
		amount=amount+amt;
		System.out.println("Credited in your account:"+amount);
	}

}
