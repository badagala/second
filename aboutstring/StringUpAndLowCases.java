package com.te.aboutstring;

public class StringUpAndLowCases {

	public static void main(String[] args) {
		
		String s="Java Developer";
		String upper=s.toUpperCase();
		String lower=s.toLowerCase();
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(s.endsWith("er"));
		System.out.println(s.startsWith("phyton"));
		System.out.println(s.contains("java"));
		String s1="";
		System.out.println(s1.isEmpty());

	}

}
