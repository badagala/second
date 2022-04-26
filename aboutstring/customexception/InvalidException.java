package com.te.customexception;

public class InvalidException extends RuntimeException{
	
	public InvalidException() {
		super();
	}

	public String toString() {
		return "Please withdraw by checking available balance ";
		
	}
	

}
