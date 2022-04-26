package com.te.comparator;

public class Car {

	
	private String name;
	private String color;
	private int modelno;

	public Car(String name, String color, int modelno) {
		super();
		this.name = name;
		this.color = color;
		this.modelno = modelno;
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

	public Integer getModelno() {
		return modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
	}

	public Car() {
		super();

	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", modelno=" + modelno + "]";
	}

}
