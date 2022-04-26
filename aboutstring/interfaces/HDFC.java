package com.te.interfaces;

public class HDFC implements RBI{

	@Override
	public void deposit() {
		System.out.println("Deposit with HDFC Bank");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw with HDFC Bank");
		
	}

	@Override
	public void aadharlink() {
		System.out.println("Link with aadharnumber");
		
	}

}
