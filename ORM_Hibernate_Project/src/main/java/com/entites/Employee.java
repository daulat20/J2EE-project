package com.entites;

public class Employee {
	int Empid;
	String empname;
	String city;
	Double salary;
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Employee(int empid, String empname, String city, Double salary) {
		super();
		Empid = empid;
		this.empname = empname;
		this.city = city;
		this.salary = salary;
	}
	public Employee() {
		
	
	}
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", empname=" + empname + ", city=" + city + ", salary=" + salary + "]";
	}
	
	
}
