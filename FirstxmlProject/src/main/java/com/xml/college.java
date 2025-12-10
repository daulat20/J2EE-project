package com.xml;

public class college {
	int Clgid;
	String clgname;
	String grade;
	Student stud;
	public int getClgid() {
		return Clgid;
	}
	public void setClgid(int clgid) {
		Clgid = clgid;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}
	public college(int clgid, String clgname, String grade, Student stud) {
		super();
		Clgid = clgid;
		this.clgname = clgname;
		this.grade = grade;
		this.stud = stud;
	}
	public college() {
	}
	@Override
	public String toString() {
		return "college [Clgid=" + Clgid + ", clgname=" + clgname + ", grade=" + grade + ", stud=" + stud + "]";
	}
	
	

}
