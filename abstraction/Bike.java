package com.te.abstraction;

public class Bike extends Vehicle{

	@Override
	public void run() {
		System.out.println("Bike is running at a speed of 85km/hr");
		
	}

	@Override
	public void name() {
		System.out.println("bike is royalenfield");
		
	}

	@Override
	public void speed() {
		System.out.println("Bike is Running with the speed of 100kmph");
		
	}

	
}
