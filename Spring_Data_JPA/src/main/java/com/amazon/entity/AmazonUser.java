package com.amazon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AmazonUser {
	
	@Id
	int id;
	String name;
	long phno;
	String address;
	String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AmazonUser(int id, String name, long phno, String address, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.address = address;
		this.email = email;
	}
	public AmazonUser() {
		super();
	}
	@Override
	public String toString() {
		return "AmazonUser [id=" + id + ", name=" + name + ", phno=" + phno + ", address=" + address + ", email="
				+ email + "]";
	}

	
}
