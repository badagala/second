package com.te.java8featuresmethodreference;

public class Box {
	
	public void creatingThread() {
	System.out.println("Thread is created and Running");
	}

	public static void main(String[] args) {
		
		Thread t1=new Thread(new Box()::creatingThread);
		t1.start();
		

	}

}
