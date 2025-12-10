package com.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_entity")
public class EmployeeEntity {
	
	@Id
	int empid;
	
	String name;
	String address;
	String phone;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public EmployeeEntity(int empid, String name, String address, String phone) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeEntity [empid=" + empid + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	

}
