package com.techno.springcoredemo;

public class Student {
	private String name;
	private int age;
	private int rollno;
	
//	public Student(String name, int age, int rollno) {
//		this.name = name;
//		this.age = age;
//		this.rollno = rollno;
	//}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollno=" + rollno + "]";
	}
	

}
