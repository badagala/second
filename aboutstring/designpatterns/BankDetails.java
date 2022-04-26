package com.te.designpatterns;

/*In Factory pattern, we create object without exposing the creation logic to the client 
and refer to newly created object using a common interface.
*/
public class BankDetails {
	
	public static void main(String[] args) {
		
		Allbanks banks=new Allbanks();
		
		Bank b=banks.getbanks("Icici");
		b.atm();
		
		Bank b1=banks.getbanks("Hdfc");
		b1.atm();
		
		Bank b2=banks.getbanks("Sbi");
		b2.atm();
	}

}
