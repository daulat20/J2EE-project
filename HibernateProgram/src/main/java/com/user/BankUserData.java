package com.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class BankUserData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int accno;
	String name;
	String address;
	long phone;
	
	@OneToOne
	KycDetails kyc;
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public KycDetails getKyc() {
		return kyc;
	}
	public void setKyc(KycDetails kyc) {
		this.kyc = kyc;
	}
	public BankUserData() {
	}
	public BankUserData(String name, String address, long phone, KycDetails kyc) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.kyc = kyc;
	}
	@Override
	public String toString() {
		return "BankUserData [name=" + name + ", address=" + address + ", phone=" + phone + ", kyc=" + kyc + "]";
	}
	
	
	
	

}
