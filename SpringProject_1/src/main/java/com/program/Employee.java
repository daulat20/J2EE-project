package com.program;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("101")
	int e_id;
	
	@Value("Daulat")
	String name;
	
	@Value("pune")
	String add;
	
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public Employee(int e_id, String name, String add) {
		super();
		this.e_id = e_id;
		this.name = name;
		this.add = add;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", name=" + name + ", add=" + add + "]";
	}
	
	
	
	

}
