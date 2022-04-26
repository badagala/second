package com.te.comparator;

import java.util.Comparator;

public class Engine implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		
		return o1.getModelno().compareTo(o2.getModelno());
		
	}

}
