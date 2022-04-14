package com.te.injection;

import org.springframework.beans.factory.annotation.Autowired;

import com.te.injectionn.Customer;

public class Marwadi {
	@Autowired
	private Customer customer;

	public Marwadi(Customer customer) {
		super();
		this.customer = customer;
	}

	public Marwadi() {
		super();
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Marwadi [customer=" + customer + "]";
	}
	

}
