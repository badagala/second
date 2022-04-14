package com.techno.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Vehicle {
	
	@Autowired
	private Bike bike;

	public Vehicle(Bike bike) {
		super();
		this.bike = bike;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehicle [bike=" + bike + "]";
	}
	
	

}
