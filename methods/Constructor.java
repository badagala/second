package com.te.methods;

public class Constructor {
	
	String name;
	String designation;
	int id;
	String company;
	
	public Constructor(String name,String designation,int id,String company) {
		
		this.name=name;
		this.designation=designation;
		this.id=id;
		this.company=company;
	}
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Designation:"+designation);
		System.out.println("id:"+id);
		System.out.println("company:"+company);
		
	}
	

	public static void main(String[] args) {
		
		Constructor con = new Constructor("Loki","Cleaner",1,"Testyantra");
		con.display();
		Constructor con1 = new Constructor("Vijay","Owner",2,"Vijaiibaava solutions(Profession only for work more on mobile)");
		con1.display();
		Constructor con2 = new Constructor("Swamy","Demotivator",3,"Poojarisolutions(Do poojas get solutions)");
		con2.display();
		Constructor con3 = new Constructor("Ravi","Employee",4,"HP");
		con3.display();
		
		
		
		

	}

}
