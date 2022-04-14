package com.techno.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {
	
	@Value("Narayana")
	private String schoolname;
	@Value("vizag")
	private String area;
	public School() {
		super();
		
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "School [schoolname=" + schoolname + ", area=" + area + "]";
	}
		
	
	

}
