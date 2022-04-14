package com.techno.springcores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
//@Component
public class Student {

	//@Autowired
	private Teacher teacher;

	public Student(Teacher teacher) {
		super();
		this.teacher = teacher;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [teacher=" + teacher + "]";
	}
	
	
	
	

}
