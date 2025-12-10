package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.EmployeeEntity;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	public String insertEmployee(EmployeeEntity e) {
		String msg =dao.insertEmployee(e);
		return msg;
	}
}
