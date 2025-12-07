package com.first;

import java.time.LocalDate;

public class Student_Attendance_manegment {

	int studroll;
	String name;
	LocalDate presentdate;
	LocalDate absentdate;
	int totalprestetday;

	public int getStudroll() {
		return studroll;
	}

	public void setStudroll(int studroll) {
		this.studroll = studroll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getPresentdate() {
		return presentdate;
	}

	public void setPresentdate(LocalDate presentdate) {
		this.presentdate = presentdate;
	}

	public LocalDate getAbsentdate() {
		return absentdate;
	}

	public void setAbsentdate(LocalDate absentdate) {
		this.absentdate = absentdate;
	}

	public int getTotalprestetday() {
		return totalprestetday;
	}

	public void setTotalprestetday(int totalprestetday) {
		this.totalprestetday = totalprestetday;
	}

	public Student_Attendance_manegment(int studroll, String name, LocalDate presentdate, LocalDate absentdate,
			int totalprestetday) {
		super();
		this.studroll = studroll;
		this.name = name;
		this.presentdate = presentdate;
		this.absentdate = absentdate;
		this.totalprestetday = totalprestetday;
	}

	public Student_Attendance_manegment() {

	}

	@Override
	public String toString() {
		return "Student_Attendance_manegment [studroll=" + studroll + ", name=" + name + ", presentdate=" + presentdate
				+ ", absentdate=" + absentdate + ", totalprestetday=" + totalprestetday + "]";
	}

}
