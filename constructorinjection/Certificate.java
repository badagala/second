package com.te.constructorinjection;

public class Certificate {
	private String name;
	private String city;
	
	public Certificate(String name, String city) {
		
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Certificate [name=" + name + ", city=" + city + "]";
	}
	

}
