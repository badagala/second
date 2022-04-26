package com.te.customexception;

public class BlankPageException extends RuntimeException {

	public BlankPageException() {
		super();

	}
	public String toString() {
		return "Please fill the details by not leaving empty space";
	}
}
