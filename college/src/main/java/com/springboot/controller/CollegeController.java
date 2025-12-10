package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.CollegeEntity;
import com.springboot.service.CollegeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class CollegeController {
	@Autowired
	CollegeService cs;

	@PostMapping("/data")
	public String addCollege(@RequestBody CollegeEntity c) {
		String msg = cs.addCollege(c);
		return msg;

	}

}
