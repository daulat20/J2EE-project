package com.springboot.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.entity.CollegeEntity;

@Repository
public class CollegeDao {
	@Autowired
	SessionFactory session;

	public String addCollege(CollegeEntity c) {
		Session ss = session.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(c);
		tr.commit();

		ss.close();
		return "Data inserted ....!";
	}

}
