package com.example.demo;

public class User {
	
	private String ssn;
	private String name;
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
	public User() {
		super();
	}
	

}
