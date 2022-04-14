package com.te.injectionn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	@Value("Raviteja")
	private String name;

	public Customer(String name) {
		super();
		this.name = name;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}

}
