package com.te.basic;

public class WhileLoop {

	public static void main(String[] args) {
		
		char c='A';
		char c1='z';
		while(c<='A') {
			System.out.println(c);
			c++;
		}
		System.out.println("");
		while(c1<='z') {
			System.out.println(c1);
			c1--;
		}
		System.out.println("");
		char c2='A';
		while(c2<='z') {
			System.out.println(c2);
			c2+=2;
		}
		
	}

}
