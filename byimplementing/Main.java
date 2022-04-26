package com.te.byimplementing;

public class Main {

	public static void main(String[] args) throws InterruptedException{
		
		Apple app=new Apple();
		Thread thread=new Thread(app);
		thread.start();
		thread.sleep(2000);
		for(int i=1;i<=6;i++) {
			System.out.println("thread after running");
			
		}
		
		
	}

}
