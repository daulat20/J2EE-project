package com.first;

import java.time.LocalDate;

public class VehicalRegistration {

	int reg_id;
	int vehicle_id;
	float reg_number;
	LocalDate issue_date;
	LocalDate renewal_date;

	public int getReg_id() {
		return reg_id;
	}

	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}

	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public float getReg_number() {
		return reg_number;
	}

	public void setReg_number(float reg_number) {
		this.reg_number = reg_number;
	}

	public LocalDate getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(LocalDate issue_date) {
		this.issue_date = issue_date;
	}

	public LocalDate getRenewal_date() {
		return renewal_date;
	}

	public void setRenewal_date(LocalDate renewal_date) {
		this.renewal_date = renewal_date;
	}

	public VehicalRegistration(int reg_id, int vehicle_id, float reg_number, LocalDate issue_date,
			LocalDate renewal_date) {
		super();
		this.reg_id = reg_id;
		this.vehicle_id = vehicle_id;
		this.reg_number = reg_number;
		this.issue_date = issue_date;
		this.renewal_date = renewal_date;
	}

	public VehicalRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VehicalRegistration [reg_id=" + reg_id + ", vehicle_id=" + vehicle_id + ", reg_number=" + reg_number
				+ ", issue_date=" + issue_date + ", renewal_date=" + renewal_date + "]";
	}

}
