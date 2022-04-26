package com.te.basic;

public class SwitchCases {

	public static void main(String[] args) {
	
		int b=2;
		switch(b) {
		case 1: System.out.println("DayName: Monday");
		break;
		case 2: System.out.println("DayName: Tuesday");
		break;
		case 3: System.out.println("DayName: Wednesday");
		break;
		case 4: System.out.println("DayName: Thursday");
		break;
		case 5: System.out.println("DayName: Friday");
		break;
		case 6: System.out.println("DayName: Saturday");
		break;
		case 7: System.out.println("DayName: Sunday");
		break;
		default:System.out.println("Day number given is invalid as per calender");
		break;
		}

	}

}
