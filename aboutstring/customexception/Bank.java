package com.te.customexception;

public class Bank {

	private String username;
	private String password;
	private double balance;

	public Bank(String username, String password, double balance) {
		super();
		this.username = username;
		this.password = password;
		this.balance = balance;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(String username, String password, double cash) {

		if (this.username.equals(username) && this.password.equals(password)) {

			this.balance += cash;

		} else {
			throw new InvalidException();

		}
//		if(this.username == null) {
//
//			throw new BlankPageException();
//		}

	}

	public void withdraw(String name, String password, double cash) {
		if (this.username.equals(username) && this.password.equals(password)) {
			if (this.balance >= cash) {
				this.balance -= cash;
			} else {
				throw new OutOfBalanceException();
			}
//			if (this.username == null) {
//
//				throw new BlankPageException();
//
//			}
		}
	}

}