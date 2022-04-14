package com.techno.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Cars")
public class Cars implements Vehicle {
	
	@Value("Honda")
	private String name;
	@Value("City")
	private String model;
	@Value("Diesel")
	private String engine;
	
	public Cars(String name, String model, String engine) {
		super();
		this.name = name;
		this.model = model;
		this.engine = engine;
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
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Cars [name=" + name + ", model=" + model + ", engine=" + engine + "]";
	}
	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
