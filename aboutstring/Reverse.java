package com.te.aboutstring;

public class Reverse {

	public static void main(String[] args) {
	   String str="My name is Rajiiii";
	   String rev="";
	   
	  
		   for(int j=str.length()-1;j>=0;j--) {
			   rev=rev+str.charAt(j);
			   
		   }
		   System.out.println(str);
		   System.out.println(rev);
	   }
	  

	}

