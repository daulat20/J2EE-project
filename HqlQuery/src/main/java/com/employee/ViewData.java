package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.first.Employee;

public class ViewData {

	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Employee.class);
		
		SessionFactory sf=cf.buildSessionFactory();
		Session s =sf.openSession();
		Transaction tr=s.beginTransaction();
		
		Employee e = s.get(Employee.class, 101);
		
		if(e != null) {
		System.out.println("Id : "+e.getEmpid());
		System.out.println("Name : "+e.getEmpname());
		System.out.println("City : "+e.getCity());
		System.out.println("Salary : "+e.getSalary());
		}else 
			System.out.println("Invalid Data");
		
		tr.commit();
		s.close();
		
		
	}
}
