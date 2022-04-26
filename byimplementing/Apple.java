package com.te.byimplementing;

public class Apple implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=7;i++) {
			System.out.println("Thread is running safely");
		}
		
	}
	
	

}
