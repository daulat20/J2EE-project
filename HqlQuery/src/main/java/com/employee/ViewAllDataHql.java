package com.employee;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.first.Employee;

public class ViewAllDataHql {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr= s.beginTransaction();
		
		String hqlQuery = "from Employee";
		Query<Employee> query = s.createQuery(hqlQuery , Employee.class);
		List<Employee> list= query.getResultList();
		
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
		
	}
}
