package com.techno.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("Showroom")

public class Showroom {
	
	
   @Autowired
   @Qualifier("Bike")
	private Vehicle vehicle;

@Override
public String toString() {
	return "Showroom [vehicle=" + vehicle + "]";
}
   
   
	
	

}
