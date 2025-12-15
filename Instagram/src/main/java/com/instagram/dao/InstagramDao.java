package com.instagram.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.instagram.enity.Instagram;

@Repository
public class InstagramDao {
	@Autowired
	SessionFactory factory;
	
	Session session = null;
	Transaction tr = null;
	String msg = null;

	public String register(Instagram i) {

		

		try {
			session = factory.openSession();
			tr = session.beginTransaction();

			session.persist(i);
			tr.commit();
			msg = "data inserted";

		} catch (Exception e) {
			if (tr != null) {
				tr.rollback();
			}

		} finally {
			if (session != null) {
				session.close();
			}
		}

		return msg;
	}

	public Instagram login(String username , String password) {
		Instagram instagram = null;

		try {
			session = factory.openSession();
			tr=session.beginTransaction();
			
			
			String hql = "from Instagram where username=:username and password=:password";
			Query<Instagram> query = session.createQuery(hql, Instagram.class);
			query.setParameter("username", username);
			query.setParameter("password", password);
			
			instagram = query.uniqueResult();
			 
			
			tr.commit();

		} catch (Exception e) {

			if (tr != null) {
				tr.rollback();
			}
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return instagram;
	}
	
	public String updateaccount(Instagram i , int id) {
		try {
			
			session= factory.openSession();
			tr=session.beginTransaction();
			
			Instagram in = session.get(Instagram.class, id);
			
			in.setUsername(i.getUsername());
			in.setMobailno(i.getMobailno());
			in.setName(i.getName());
			in.setEmail(i.getEmail());
			in.setPassword(i.getPassword());
			in.setGender(i.getGender());
			in.setDob(i.getDob());
			
			session.merge(in);
			
			tr.commit();
			msg = "data updated";
			
		} catch (Exception e) {

			if (tr != null) {
				tr.rollback();
			}
		}
		finally {
			if (session != null) {
				session.close();
			}
		}
		return msg;
		
	}

	public List<Instagram> getAllData() {
		
		List<Instagram> list = null;
		
		try {
			session = factory.openSession();
			tr = session.beginTransaction();
		
			String hql = "from Instagram";
			  list = session.createQuery(hql, Instagram.class)
			            .getResultList();
			tr.commit();
			msg = "Get all data";
			
			
			
		} catch (Exception e) {
			if (tr != null) {
				tr.rollback();
			}
		}
		finally {
			session.close();

		}
		return list;
	}
	
	public String deleteaccount(int id) {
	
		try {
			session= factory.openSession();
			tr= session.beginTransaction();
			Instagram ee = session.get(Instagram.class, id);
			session.remove(ee);

			tr.commit();
			msg = "data deleted";
		} catch (Exception e) {
			if (tr != null) {
				tr.rollback();
			}
		}
		finally {
			session.close();

		}
		return msg;

	}
	

}
