package com.hospital;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.first.Hospital;

public class InsertData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hospital.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

//		Hospital h = new Hospital();
//		h.setName("sagar");
//		h.setSpecialization("Cardiology (heart) ");
//		h.setQualifications("MBBS degree");
//		h.setContact(7563109155l);
//		
//		ss.persist(h);
//		System.out.println("data inserted");

		int doctor_id = 1;

		String hqlQuery = "from Hospital where doctor_id =:doctor_id";
		Query<Hospital> query = ss.createQuery(hqlQuery, Hospital.class);
		query.setParameter("doctor_id", doctor_id);

		Hospital h = query.getSingleResult();
		System.out.println(h);

		tr.commit();
		ss.close();

	}

}
