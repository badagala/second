package com.te.interfaces;

public interface RBI {
	
	void deposit();
	void withdraw();
	void aadharlink();
	
	default void KYC() {
		System.out.println("Update Your KYC number");
	}

}
