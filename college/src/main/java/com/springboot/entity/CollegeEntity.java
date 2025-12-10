package com.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CollegeEntity {
	@Id
	int clgid;
	String clg_name;
	String grade;
	String address;
	public int getClgid() {
		return clgid;
	}
	public void setClgid(int clgid) {
		this.clgid = clgid;
	}
	public String getClg_name() {
		return clg_name;
	}
	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public CollegeEntity(int clgid, String clg_name, String grade, String address) {
		super();
		this.clgid = clgid;
		this.clg_name = clg_name;
		this.grade = grade;
		this.address = address;
	}
	public CollegeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CollegeEntity [clgid=" + clgid + ", clg_name=" + clg_name + ", grade=" + grade + ", address=" + address
				+ "]";
	}
	
	


	
}
