package com.te.aboutstring;

/*indexOf(char):int 
indexOf(String):int 
indexOf(char,int fromindex):int 
indexOf(String,int fromindex):int 
• it provides index value for given string or character
• indexOf() returns -1, if character or string is not present*/

public class Indexoff {

	public static void main(String[] args) {
		String s="I am java developer";
		int i =s.indexOf(1);
		System.out.println(i);
		int i1=s.indexOf(2, 'v');
		System.out.println(i1);
		int i2=s.indexOf('d');
		System.out.println(i2);
		int i3=s.indexOf('a',5);
		System.out.println(i3);

	}

}
