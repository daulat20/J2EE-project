package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.first.Employee;

public class UpdateData {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		int id = 102;
		Employee e =s.get(Employee.class, id);
		e.setCity("pune");
		
		s.merge(e);
		System.out.println("Student data updated");
		
		tr.commit();
		s.close();
		
	}

}
