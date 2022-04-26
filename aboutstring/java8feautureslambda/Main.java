package com.te.java8feautureslambda;

public class Main {

	public static void main(String[] args) {
		
		String sketchpen="Red";
		
		Draw draw=new Draw() {
			public void sketch() {
				System.out.println("PenColor"+sketchpen);
		}
		};
		
		draw.sketch();

	}

}

//we are doing taking as anonminous class