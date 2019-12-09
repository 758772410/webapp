package edu.swjtuhc.demo.model;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

public class SysUser {
		
	private String username;
	private String password;
	private int age;
	private String email;
	private String gift;
	private String comments;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGift() {
		return gift;
	}
	public void setGift(String gift) {
		this.gift = gift;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "SysUser [username=" + username + ", password=" + password + ", age=" + age + ", email=" + email
				+ ", gift=" + gift + ", comments=" + comments + "]";
	}
	
}
