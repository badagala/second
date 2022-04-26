package com.te.java8featuresmethodreference;

import java.util.function.BiFunction;

public class Arithemetic1 {
	
	public int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer>addvalues=new Arithemetic1()::add;
		int add=addvalues.apply(50, 90);
		System.out.println(add);
		
		

	}

}
