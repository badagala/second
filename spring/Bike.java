package com.techno.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Bike")
public class Bike implements Vehicle {
	
	@Value("Hero")
	private String name;
	@Value("Pleasure")
	private String model;
	@Value("Petrol")
	private String oil;
	
	public Bike(String name, String model, String oil) {
		super();
		this.name = name;
		this.model = model;
		this.oil = oil;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOil() {
		return oil;
	}
	public void setOil(String oil) {
		this.oil = oil;
	}
	@Override
	public String toString() {
		return "Bike [name=" + name + ", model=" + model + ", oil=" + oil + "]";
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
