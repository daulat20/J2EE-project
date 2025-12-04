package com.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LicenseKeyEntity {

    @Id
    private int lId;

    private String lvalue;
    private String expdate;
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getLvalue() {
		return lvalue;
	}
	public void setLvalue(String lvalue) {
		this.lvalue = lvalue;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public LicenseKeyEntity() {
	}
	public LicenseKeyEntity(int lId, String lvalue, String expdate) {
		super();
		this.lId = lId;
		this.lvalue = lvalue;
		this.expdate = expdate;
	}
	@Override
	public String toString() {
		return "LicenseKeyEntity [lId=" + lId + ", lvalue=" + lvalue + ", expdate=" + expdate + "]";
	}
    
    

}
