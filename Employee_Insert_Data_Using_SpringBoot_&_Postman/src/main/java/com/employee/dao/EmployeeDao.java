package com.employee.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entity.EmployeeEntity;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory session;
	
	public String insertEmployee(EmployeeEntity e) {
		Session ss = session.openSession();
		Transaction tr = ss.beginTransaction();
		
		ss.persist(e);
		
		tr.commit();
		ss.close();
		
		return "Data is inserted";
		
	}
}
