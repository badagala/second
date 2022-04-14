package com.te;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component
public class Subject {
	@Value("Biology")
	private String name;
	@Value("1105")
	private int pages;
	
	public Subject(String name, int pages) {
		super();
		this.name = name;
		this.pages = pages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Subject [name=" + name + ", pages=" + pages + "]";
	}

	
}
