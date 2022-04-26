package com.te.array;

public class MissingNumbersFromAnArray {

	public static void main(String[] args) {
		boolean status=true;
		int a[]= {10,11,25,28,8,5,35,55};
		
		for(int i=0;i<100;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
					status=false;
					break;
				}
			}
			if(status==true) {
				System.out.println(i);
			}
			status=true;
		}

	}

}
