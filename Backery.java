package com.techno;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Backery {
	private String name;
	private List<Integer>items;
	private Set<String>address;
	private Map<Integer,String>area;
	
	public Backery(String name, List<Integer> items, Set<String> address, Map<Integer, String> area) {
		super();
		this.name = name;
		this.items = items;
		this.address = address;
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public List<Integer> getItems() {
		return items;
	}
	public Set<String> getAddress() {
		return address;
	}
	public Map<Integer, String> getArea() {
		return area;
	}
	@Override
	public String toString() {
		return "Backery [name=" + name + ", items=" + items + ", address=" + address + ", area=" + area + "]";
	}
	public Backery() {
		
	}
	
	
	
}

