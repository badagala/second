package com.te.aboutstring;

public class RevereAString {

	public static void main(String[] args) {
		
		String str="He is a good actor";
		String sr="";
		
		for(int i=str.length()-1;i>=0;i--) {
			sr=sr+str.charAt(i);
		}
		System.out.println("Reverse a sentence is:"+sr);
		}

}
