 package com.te.abstraction;

public class Operation extends Calculator{

	@Override
	public void add(int i, int j) {
		System.out.println(i+j);
		
	}

	@Override
	public void multiply(int i, int j) {
		System.out.println(i*j);
		
	}

	@Override
	public void divide(int i, int j) {
        System.out.println(i/j);
		
	}

	@Override
	public void substract(int i, int j) {
		System.out.println(i-j);
		
	}

}
