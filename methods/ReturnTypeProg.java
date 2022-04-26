package com.te.methods;

public class ReturnTypeProg {
	
	public static boolean login(String username,int password) {
		if(username=="TechnoElevate"&&password==1234) {
			return true;	
		}else {
			return false;
		}
		
		
	}

	public static void main(String[] args) {
	
		System.out.println(login("Swamy",123));
		System.out.println(login("TechnoElevate",1234));
	}

}
