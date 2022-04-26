package com.te.array;

public class Apple {

	public static void main(String[] args) {
		int b[]=new int[10];
		b[0]=30;
		b[1]=55;
		b[8]=95;
		b[4]=52;
		b[9]=58;
		
		//System.out.println(b);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		String[] str= {"java","Oracle","Python","Sql"};
		//System.out.println(str);
		
		for(String st:str) {
			System.out.println(st);
		}
	}

}
