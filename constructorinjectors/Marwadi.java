package com.te.constructorinjectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Marwadi {
	
	@Autowired
	@Qualifier("customer2")
	private Customers customer;
	
	public Marwadi(Customers customer) {
		super();
		this.customer = customer;
		}
	
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public Marwadi() {
		super();
		
	}

	@Override
	public String toString() {
		return "Marwadi [customer=" + customer + "]";
	}
	
	

}
