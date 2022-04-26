package com.te.singleton;

public class Main {
	
	public static void main(String[] args) {
		Singleton sin=Singleton.getSingle();
		sin.showMessage();
	}

}
