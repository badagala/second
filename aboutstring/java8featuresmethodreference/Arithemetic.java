package com.te.java8featuresmethodreference;

import java.util.function.BiFunction;

/*You can also use predefined functional interface to refer methods. In the following example, 
we are using BiFunction interface and using it's apply() method.
*/
public class Arithemetic {
	
	public static int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
	
		BiFunction<Integer, Integer, Integer>adding=Arithemetic::add;
		int getresult=adding.apply(20, 30);
		System.out.println(getresult);
		
		

	}

}
