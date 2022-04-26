package com.te.compareable;

public class Bike implements Comparable<Bike>{
	
	private int cc;
	private String name;
	private String color;
	
	
	public Integer getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Bike(int cc, String name, String color) {
		super();
		this.cc = cc;
		this.name = name;
		this.color = color;
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bike [cc=" + cc + ", name=" + name + ", color=" + color + "]";
	}
	@Override
	public int compareTo(Bike o) {
		
		return this.getCc().compareTo(o.getCc());
				
	}
	
	
	
	
	

}
