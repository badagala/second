package com.te.Null;

public class Home {
	String address;
	int rooms;
	public Home(String address, int rooms) {
		super();
		this.address = address;
		this.rooms = rooms;
	}
	public String getAddress() {
		return address;
	}
	public int getRooms() {
		return rooms;
	}
	@Override
	public String toString() {
		return "Home [address=" + address + ", rooms=" + rooms + "]";
	}
	

}
