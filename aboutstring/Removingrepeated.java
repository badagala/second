package com.te.aboutstring;

public class Removingrepeated {

	public static void main(String[] args) {
		String s="Java Developer Java Devops java java developers";
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(s1.indexOf(ch)==-1) {
				s1=s1+ch;
			}

		}
		System.out.println("Printing non repeated elements:"+s1);
	}

}
