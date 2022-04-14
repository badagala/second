package com.techno.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Room {
	
	@Value("101")
	private int roomno;
	@Value("tenthclass")
	private String name;
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Room [roomno=" + roomno + ", name=" + name + "]";
	}
	

}
