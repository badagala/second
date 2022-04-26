package com.te.aboutstring;

public class Third {
	
	public static void main(String[] args) {
		
		String str="This is Raviteja.I Am From AndhraPradesh";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'|| str.charAt(i)=='A') {
				count++;
				
			}
			
		}System.out.println("Counting of a/A is:"+count);
		
		
		
	}
}
