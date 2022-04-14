package com.technoelevate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class State {
	
	@Value("Andhrapradesh")
	private String name;
	@Value("Southern")
	private String direction;
	
	@Override
	public String toString() {
		return "State [name=" + name + ", direction=" + direction + "]";
	}

	public State() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public State(String name, String direction) {
		super();
		this.name = name;
		this.direction = direction;
	}
	
}