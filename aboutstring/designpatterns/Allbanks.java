package com.te.designpatterns;

public class Allbanks {
	
	public Bank getbanks(String bankname) {
		
		if(bankname==null) {
			return null; 
		}
		if(bankname.equals("Icici")) {
			return new Icici();
		}else if(bankname.equals("Sbi")) {
			return new Sbi();
		}else if(bankname.equals("Hdfc")) {
			return new Hdfc();
			
		}
		return null;
	}

}
