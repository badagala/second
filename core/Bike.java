package com.techno.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	
	@Value("trumph")
	private String name;
	@Value("1254")
	private String modelno;
	@Value("petrol")
	private String oil;
	public Bike(String name, String modelno, String oil) {
		super();
		this.name = name;
		this.modelno = modelno;
		this.oil = oil;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModelno() {
		return modelno;
	}
	public void setModelno(String modelno) {
		this.modelno = modelno;
	}
	public String getOil() {
		return oil;
	}
	public void setOil(String oil) {
		this.oil = oil;
	}
	@Override
	public String toString() {
		return "Bike [name=" + name + ", modelno=" + modelno + ", oil=" + oil + "]";
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
