package com.te.interfaces;

public class ICICI implements RBI{

	@Override
	public void deposit() {
		System.out.println("Deposit by ICICI bank");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw In ICICI bank");
		
	}

	@Override
	public void aadharlink() {
		System.out.println("AadharLink is mandatory ");
		
	}

}
