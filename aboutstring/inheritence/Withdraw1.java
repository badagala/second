package com.te.inheritence;

public class Withdraw1 extends Bank2 {
	
	double balance =10000;
	
	public void withdraw() {
		amount=amount-balance;
		System.out.println("WithDraw amount is:"+amount);
	}

}
