package com.hletong.dao.dto;

public class UserDto {
	
	private int id;
	
	private String userName;
	
	private String password;
	
	private long age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}
}
