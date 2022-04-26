package com.te.methods;

public class Van {
	
	String name;
	String area;
	int price;
	String book;
	
	public Van() {
		name="vijay";
		area="amalpadu";
		price=50;
		book="maths";
	}

	public static void main(String[] args) {
		
		Van v=new Van();
		System.out.println(v.name);
		System.out.println(v.area);
		System.out.println(v.price);
		System.out.println(v.book);
		
		

	}

}
