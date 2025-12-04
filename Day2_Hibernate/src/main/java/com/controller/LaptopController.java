package com.controller;

import com.entites.LaptopEntity;
import com.entites.LicenseKeyEntity;
import com.entites.OperatingSystemEntity;
import com.services.LaptopService;

public class LaptopController {
	public static void main(String[] args) {
		
		LicenseKeyEntity le = new LicenseKeyEntity();
		le.setlId(211);
		le.setLvalue("WIN-123-XYZ");
		le.setExpdate("2026-09-03");
		
		OperatingSystemEntity os = new OperatingSystemEntity();
		
		os.setOsname("Windows 11");
		os.setLe(le);
		
		LaptopEntity lp = new LaptopEntity();
		lp.setName("HP");
		lp.setOs(os);
		
		LaptopService ls = new LaptopService();
		ls.addLaptop(lp);
		
		System.out.println("laptop data inserted");
	}

}
