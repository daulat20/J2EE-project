package com.program;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Value("111")
	int comp_id;
	
	@Value("TCS")
	String cname;
	
	@Autowired
	Employee emp;

	public int getComp_id() {
		return comp_id;
	}

	public void setComp_id(int comp_id) {
		this.comp_id = comp_id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Company(int comp_id, String cname, Employee emp) {
		super();
		this.comp_id = comp_id;
		this.cname = cname;
		this.emp = emp;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Company [comp_id=" + comp_id + ", cname=" + cname + ", emp=" + emp + "]";
	}
	
	
	
	
	
	
	

}
