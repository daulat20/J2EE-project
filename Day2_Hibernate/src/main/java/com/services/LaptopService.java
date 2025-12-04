package com.services;

import com.dao.LaptopDao;
import com.entites.LaptopEntity;

public class LaptopService {
	
	LaptopDao ld = new LaptopDao();
	
	public void addLaptop(LaptopEntity laptop){
		ld.insertdata(laptop);
	}

}
