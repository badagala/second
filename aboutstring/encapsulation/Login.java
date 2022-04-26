package com.te.encapsulation;

public class Login {

	private String username;
	private String password;
	
	
	
	
	public String getUsername() {
		if(username=="ravi") {
			return "username is correct,please enter password";
		}else {
			
			return username;
			
		}
		
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		if(password=="raviteja123") {
			return "please go ahead";
		}else {
		return "Enter password is invalid";
		}
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
