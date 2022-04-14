
package com.techno.springcoredemo1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private String name;
	private List<Integer>mobileno;
	private Set<String>address;
	private Map<Integer, String> area;
//	
//	public Employee(String name, List<Integer> mobileno, Set<String> address, Map<Integer, String> area) {
//		
//		this.name = name;
//		this.mobileno = mobileno;
//		this.address = address;
//		this.area = area;
//	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMobileno(List<Integer> mobileno) {
		this.mobileno = mobileno;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public void setArea(Map<Integer, String> area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", mobileno=" + mobileno + ", address=" + address + ", area=" + area + "]";
	}
	
	
	

}
