package com.te.aboutstring;

public class FindingVowels {

	public static void main(String[] args) {
		String s="I am java Developer which i have learnt in testyantra software solutions";
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				System.out.println(s.charAt(i));
				count ++;
				
			}
		}
		System.out.println("Number of vowels in the sentence is:"+count);
	}

}
