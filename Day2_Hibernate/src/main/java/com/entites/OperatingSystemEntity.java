package com.entites;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class OperatingSystemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int osid;

    private String osname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "license_id")
    private LicenseKeyEntity le;

	public int getOsid() {
		return osid;
	}

	public void setOsid(int osid) {
		this.osid = osid;
	}

	public String getOsname() {
		return osname;
	}

	public void setOsname(String osname) {
		this.osname = osname;
	}

	public LicenseKeyEntity getLe() {
		return le;
	}

	public void setLe(LicenseKeyEntity le) {
		this.le = le;
	}

	public OperatingSystemEntity() {
	}

	public OperatingSystemEntity(int osid, String osname, LicenseKeyEntity le) {
		super();
		this.osid = osid;
		this.osname = osname;
		this.le = le;
	}

	@Override
	public String toString() {
		return "OperatingSystemEntity [osid=" + osid + ", osname=" + osname + ", le=" + le + "]";
	}

   
}
