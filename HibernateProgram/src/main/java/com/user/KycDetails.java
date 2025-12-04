package com.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class KycDetails {
	@Id
	long aadharno;
	String pancard;
	
	
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public KycDetails() {
	}
	public KycDetails(long aadharno, String pancard) {
		super();
		this.aadharno = aadharno;
		this.pancard = pancard;
	}
	@Override
	public String toString() {
		return "KycDetails [aadharno=" + aadharno + ", pancard=" + pancard + "]";
	}
	
	

}
