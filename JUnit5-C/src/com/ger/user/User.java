package com.ger.user;

public class User {
	
	private int id;
	private String userName;
	
	public User(int id, String userName) {
		this.id = id;
		this.userName = userName;
	}
	
	@Override
	public boolean equals(Object userObject) {
		User userObj = (User) userObject;
		if(this.id == userObj.id) {
			return true;
		}
		return false;
	}

}
