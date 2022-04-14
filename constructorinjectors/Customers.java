package com.te.constructorinjectors;

public class Customers {
	private String name;

	public Customers(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customers() {
		super();
		
	}

	@Override
	public String toString() {
		return "Customers [name=" + name + "]";
	}
	

}
