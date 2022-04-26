package com.te.abstraction;

public abstract class School {
	
	@Override
	public String toString() {
		return "School [name=" + name + ", area=" + area + ", rooms=" + rooms + "]";
	}
	String name;
	String area;
	String rooms;
	
	public School(String name,String area,String rooms) {
		this.name=name;
		this.area=area;
		this.rooms=rooms;	
		
	}
	public abstract void details();
	
}
