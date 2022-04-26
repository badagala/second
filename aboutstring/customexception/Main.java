package com.te.customexception;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank("Raviteja", "Raviteja123", 5000);
		bank.deposit("Raviteja", "Raviteja123", 10000);
		bank.withdraw("Raviteja", "Raviteja123", 500000);
		
		System.out.println(bank.getBalance());

	}

}
