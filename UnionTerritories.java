package com.technoelevate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UnionTerritories {
	
	@Value("Islands")
	private String name;
	@Value("12")
	private int count;
	
	public UnionTerritories(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public UnionTerritories() {
		super();
	}
	@Override
	public String toString() {
		return "UnionTerritories [name=" + name + ", count=" + count + "]";
	}
	

}
