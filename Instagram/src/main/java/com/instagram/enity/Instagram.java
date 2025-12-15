package com.instagram.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Instagram {
	
	@Id
	int id;
	
	String username;
	long mobailno;
	String name;
	String email;
	String password;
	String gender;
	String dob;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getMobailno() {
		return mobailno;
	}
	public void setMobailno(long mobailno) {
		this.mobailno = mobailno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Instagram [id=" + id + ", username=" + username + ", mobailno=" + mobailno + ", name=" + name
				+ ", email=" + email + ", password=" + password + ", gender=" + gender + ", dob=" + dob + "]";
	}
	public Instagram(int id, String username, long mobailno, String name, String email, String password, String gender,
			String dob) {
		super();
		this.id = id;
		this.username = username;
		this.mobailno = mobailno;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
	}
	public Instagram() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
