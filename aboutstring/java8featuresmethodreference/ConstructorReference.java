package com.te.java8featuresmethodreference;

public class ConstructorReference {

	public static void main(String[] args) {
		
		School school=Students::new;
		school.getStudents("Hello students");

	}

}
