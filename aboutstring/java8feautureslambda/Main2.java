package com.te.java8feautureslambda;

public class Main2 {

	public static void main(String[] args) {
		
		Book b=(name,textbookname)->(name+textbookname);
		System.out.println(b.pages("200pages", "socialbook"));
		
		Book b1=(String name,String textbookname)->(name+textbookname);
		System.out.println(b1.pages("500pages","Economicsbook"));
			
			
			
		

	}

}
