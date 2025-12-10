package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.CollegeDao;
import com.springboot.entity.CollegeEntity;

@Service
public class CollegeService {
	@Autowired
	CollegeDao cd;
	
	public String addCollege(CollegeEntity c) {
		String msg = cd.addCollege(c);
		return msg;
		
	}

}
