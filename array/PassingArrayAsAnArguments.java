package com.te.array;

public class PassingArrayAsAnArguments {

	private String name;
	private String rollno;
	private String school;
	private int age;

	public PassingArrayAsAnArguments(String name, String rollno, String school, int age) {
		this.name = name;
		this.rollno = rollno;
		this.school = school;
		this.age = age;

	}

	public static void main(String[] args) {
		PassingArrayAsAnArguments pass[] = new PassingArrayAsAnArguments[3];
		pass[0] = new PassingArrayAsAnArguments("Ravi", "120", "Narayana", 18);
		pass[1] = new PassingArrayAsAnArguments("Teja", "150", "Chaitanya", 25);
		pass[2] = new PassingArrayAsAnArguments("Raviteja", "270", "SriChaitanyaNarayana", 28);
		details(pass);

	}

	public static void details(PassingArrayAsAnArguments passing[]) {
		System.out.println("Printing Student Details");
		for (PassingArrayAsAnArguments student : passing) {
			System.out.println(student.name + " " + student.rollno + " " + student.school + " " + student.age);

		}
	}
}
