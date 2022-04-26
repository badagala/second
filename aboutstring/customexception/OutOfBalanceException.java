package com.te.customexception;

public class OutOfBalanceException extends RuntimeException{
	
	public OutOfBalanceException() {
		super();
	}
	public String toString() {
		return "Your available balance is exceeded";
	}

	
}
