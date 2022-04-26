package com.te.abstraction;

public abstract class Vehicle {
	
	abstract public void run();
	abstract public void name();
	public abstract void speed();
	
	public void light() {
		System.out.println("Led light which it focus more ");
	}

}
