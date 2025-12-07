package com.first;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HospitalData")  //  change table name
public class Hospital {
	@Id							// primery key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto_increment
	int doctor_id;
	@Column(nullable = false)		//null
	String name;
	String specialization;
	String qualifications;
	long contact;
	
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
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
	public String getQualifications() {
		return qualifications;
	}
	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	public Hospital(int doctor_id, String name, String specialization, String qualifications, long contact) {
		super();
		this.doctor_id = doctor_id;
		this.name = name;
		this.specialization = specialization;
		this.qualifications = qualifications;
		this.contact = contact;
	}
	public Hospital() {
		
	}
	@Override
	public String toString() {
		return "Hospital [doctor_id=" + doctor_id + ", name=" + name + ", specialization=" + specialization
				+ ", qualifications=" + qualifications + ", contact=" + contact + "]";
	} 
	
	

}
