package com.te.methods;

public class StaticMethod {
	
	public static void main(String[] args) {
		
		login("Loki",1,"syalada",895462256);
		login("Swamy",2,"kajji",896462256);
		login("Vijay",3,"kokkiri",895461156);
		
		
	}
	public static void login(String name,int id,String surname,long mobileno) {
		System.out.println("Entered name is:"+name);
		System.out.println("Entered id is:"+id);
		System.out.println("Entered surname is:"+surname);
		System.out.println("Entered mobileno is:"+mobileno);
	}

	
	
	
	
}


