package com.te.methods;

public class Bike {

	String name;
	String color;
	String model;
	int id;
	String engine;

	public static void main(String[] args) {

		Bike c = new Bike("Duke", "red", "220", 58, "petrol");
		Bike c1 = new Bike("Honda125", "Black", "200", 59, "petrol");
		Bike c2 = new Bike("Yamaha", "Black&Red", "210", 57, "petrol");
		Bike c3 = new Bike("RoyalEnfield", "Black&Red", "220", 56, "petrol");

		c.donkey();
		c1.donkey();
		c2.donkey();
		c3.donkey();

	}

	public Bike(String uname, String ucolor, String model, int id, String engine) {

		this.name = uname;
		this.color = ucolor;
		this.model = model;
		this.id = id;
		this.engine = engine;
	}

	public void donkey() {

		System.out.println("Name:" + name + " " + "Color:" + color + " " + "Model:" + model + " " + "id:" + id + " "
				+ "Engine:" + " " + engine);
	}

}
