package com.xml;

public class Student {
	
	int rollno;
	String name;
	String age;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Student(int rollno, String name, String age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public Student() {
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	

}
