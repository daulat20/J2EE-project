package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.first.Employee;


public class Deletedata {
	public static void main(String[] args) {
		
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Employee.class);
		
		SessionFactory sf=cf.buildSessionFactory();
		Session s =sf.openSession();
		Transaction tr=s.beginTransaction();
		
		int id = 101;
		Employee e =s.get(Employee.class, id);
		
		s.remove(e);
		System.out.println("Data Deleted");
	
		
		
		tr.commit();
		s.close();
		
	}
	


}
