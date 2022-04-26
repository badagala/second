package com.te.java8feautureslambda;

public class Mobile {

	private int id;
	private String name;
	private String ram;
	private String storage;

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", ram=" + ram + ", storage=" + storage + "]";
	}

	public Mobile(int id, String name, String ram, String storage) {
		super();
		this.id = id;
		this.name = name;
		this.ram = ram;
		this.storage = storage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

}
