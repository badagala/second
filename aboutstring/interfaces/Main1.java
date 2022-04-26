package com.te.interfaces;

public class Main1 {

	public static void main(String[] args) {
	    
		SBH s=new SBH();
		s.aadharlink();
		s.deposit();
		s.KYC();
		s.minbal();
		s.withdraw();
		
		
		ICICI i=new ICICI();
		i.aadharlink();
		i.deposit();
		i.KYC();
		i.withdraw();
		
		
		PNB p=new PNB();
		p.aadharlink();
		p.deposit();
		p.KYC();
		p.withdraw();
		
		HDFC h=new HDFC();
		h.aadharlink();
		h.deposit();
		h.KYC();
		h.withdraw();
		

	}

}
