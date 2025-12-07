package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.first.Employee;

public class ViewSingleData {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		
//		Display data
//		int Empid = 101;
//		String hqlQuery = "from Employee where Empid =:Empid";
//		Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
//		query.setParameter("Empid", Empid);
//
//		Employee e = query.getSingleResult();
//		System.out.println(e);

		
//		update data
//		int Empid =101;
//		String hqlQuery = "update Employee set empname=:empname where Empid =: Empid";
//		
//		Query query = ss.createQuery(hqlQuery);
//		
//		query.setParameter("empname", "daulat");
//		query.setParameter("Empid", Empid);
//		
//		int update = query.executeUpdate();
//		System.out.println(update);
		
		
//		Delete data
		
		int Empid=104;
		String hqlQuery = "delete from Employee where Empid =: Empid";
		Query query = ss.createQuery(hqlQuery);
		query.setParameter("Empid", Empid);
		int delete = query.executeUpdate();
		
		System.out.println(delete);
		
			
		ss.close();
		tr.commit();
	}

}
