package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entites.LaptopEntity;
import com.entites.LicenseKeyEntity;
import com.entites.OperatingSystemEntity;

public class LaptopDao {
	
	public void insertdata(LaptopEntity lap) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(LaptopEntity.class);
		cfg.addAnnotatedClass(OperatingSystemEntity.class);
		cfg.addAnnotatedClass(LicenseKeyEntity.class);
		
		SessionFactory sf =  cfg.buildSessionFactory();
		Session ss =sf.openSession();
 		Transaction tr = ss.beginTransaction();
 		
 		ss.persist(lap);
 		
 		tr.commit();
 		ss.close();
		
	}

}
