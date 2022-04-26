package com.te.inheritence;

public class Machine extends Bank {
	
	double amount=100.70;
	
	public void deposited()
	{
		amt =amt+amount;
		System.out.println("Available balance is:"+amt);
	}
}
