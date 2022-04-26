package com.te.interfaces;

public class PNB implements RBI{

	@Override
	public void deposit() {
		System.out.println("Deposit in PNB Bank");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw in PNB bank");
		
	}

	@Override
	public void aadharlink() {
		System.out.println("Link with aadhar ");
		
	}

}
