package com.techno.springcores;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//@Component
public class Teacher {
	//@Value("vijay")
	private String name;
	//@Value("Chemistry")
	private String subject;
	
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	
	

}
