package com.entites;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class LaptopEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int laptopid;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "os_id")
    private OperatingSystemEntity os;

	public int getLaptopid() {
		return laptopid;
	}

	public void setLaptopid(int laptopid) {
		this.laptopid = laptopid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OperatingSystemEntity getOs() {
		return os;
	}

	public void setOs(OperatingSystemEntity os) {
		this.os = os;
	}

	public LaptopEntity() {
		
	}

	public LaptopEntity(int laptopid, String name, OperatingSystemEntity os) {
		super();
		this.laptopid = laptopid;
		this.name = name;
		this.os = os;
	}

	@Override
	public String toString() {
		return "LaptopEntity [laptopid=" + laptopid + ", name=" + name + ", os=" + os + "]";
	}

    
}
