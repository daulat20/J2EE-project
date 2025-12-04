package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.user.BankUserData;
import com.user.KycDetails;

public class MainMethod {

	public static void main(String[] args) {
		Configuration  cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(BankUserData.class);
		cfg.addAnnotatedClass(KycDetails.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		KycDetails k = new KycDetails();
		k.setAadharno(2345323456763l);
		k.setPancard("EUTPM9087F");
		
		ss.persist(k);
		
		BankUserData b = new BankUserData();
		b.setName("daulat");
		b.setAddress("pune");
		b.setPhone(7448109155l);
		b.setKyc(k);
		
		ss.persist(b);
		
		System.out.println("Data inserted");
		
		tr.commit();
		ss.close();
		
	}
}
