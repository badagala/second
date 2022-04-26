package com.te.inheritence;

public class Withdrawal extends Deposit{
	
	int amt=8000;
	
	public void withdrawn() {
		
		
		
		if(amount>amt) {
			
			System.out.println("Amount withdrawn successfully:"+amt);
		}else {
			System.out.println("Insuffient Balance in your account");
		}
	}

}
