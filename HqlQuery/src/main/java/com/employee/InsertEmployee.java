package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.first.Employee;

public class InsertEmployee {
	
	public static void main(String[] args) {
		
		Configuration  cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Employee e = new Employee();
		e.setEmpid(104);
		e.setEmpname("radhe");
		e.setCity("nigdi");
		e.setSalary(40000.0);
		
		ss.persist(e);
		System.out.println("Data inserted");
		tr.commit();
		ss.close();
	}

}
