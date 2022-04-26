package com.te.java8featuresmethodreference;


//By using instance method reference
/*There are three types of method references:
	1)Static Method Reference
2)Instance Method Reference
3)Constructor reference
*/

public class SuperMarket {

	public void buyingFruits() {
		System.out.println("Poojari is Buying fruits for temple");
	}

	public static void main(String[] args) {

		SuperMarket mark = new SuperMarket();

		Market marker = mark::buyingFruits;

		marker.fruits();

		Market marks = new SuperMarket()::buyingFruits;
		
		marks.fruits();

	}

}
