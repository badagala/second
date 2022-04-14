package com.techno.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.te.Student;
import com.te.Subject;

@Component
@ComponentScan("com.te")
public class Teacher {
	
	@Autowired
	private Student student;
	@Autowired
	private Subject subject;
	
	public Teacher(Student student, Subject subject) {
		super();
		this.student = student;
		this.subject = subject;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Teacher() {
		super();
		
	}

	@Override
	public String toString() {
		return "Teacher [student=" + student + ", subject=" + subject + "]";
	}
	
	
	

}
