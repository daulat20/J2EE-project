package com.hospial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DoctorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int d_id;
	
	private String name;
	private String specialization;
	private String email;
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public DoctorEntity(int d_id, String name, String specialization, String email) {
		super();
		this.d_id = d_id;
		this.name = name;
		this.specialization = specialization;
		this.email = email;
	}
	
	public DoctorEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DoctorService [d_id=" + d_id + ", name=" + name + ", specialization=" + specialization + ", email="
				+ email + "]";
	}
	
	
	

}
