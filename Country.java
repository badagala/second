package com.technoelevate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Country")
public class Country {
	
	@Autowired
	private State States;
	@Autowired
	private UnionTerritories union;
	
	public Country(State states, UnionTerritories union) {
		super();
		States = states;
		this.union = union;
	}
	public State getStates() {
		return States;
	}
	public void setStates(State states) {
		States = states;
	}
	public UnionTerritories getUnion() {
		return union;
	}
	public void setUnion(UnionTerritories union) {
		this.union = union;
	}
	public Country() {
		super();
	}
	@Override
	public String toString() {
		return "Country [States=" + States + ", union=" + union + "]";
	}
	}

