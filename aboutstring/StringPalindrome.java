package com.te.aboutstring;

public class StringPalindrome {

	public static void main(String[] args) {

		String str = "MoM";
		String rev = " ";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		System.out.println("Given String:" + str);
		System.out.println("After Reversing a String:" + rev);
		
		if(str.equals(rev)) {
			
			System.out.println("Given word is an palindrome");
			
		}else {
			
			System.out.println("Given word is not an palindrome");
		}

	}
}
