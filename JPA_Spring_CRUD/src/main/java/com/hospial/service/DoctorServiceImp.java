package com.hospial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospial.dao.DoctorDao;
import com.hospial.entity.DoctorEntity;

@Service
public class DoctorServiceImp implements DoctorServise {
 
	@Autowired
	 DoctorDao dao;
	
	
	@Override
	public boolean adddoctor(DoctorEntity d) {
		boolean status = false;
		try {
			dao.save(d);
			status=true;
			
		} catch (Exception e) {

		e.printStackTrace();
		status = false;
		}
		
		return status;
	}

	@Override
	public List<DoctorEntity> getDoctorDetail() {
		return dao.findAll();
	}

	@Override
	public DoctorEntity getdetail(int id) {
		
		  Optional<DoctorEntity> old = dao.findById(id);
		DoctorEntity status = old.get();
		return status;
		
		
	}

	@Override
	public boolean updetails(int id, String name , String email) {

		DoctorEntity de = getdetail(id);
		
		if(de!=null) {
			de.setName(name);
			de.setEmail(email);
			dao.save(de);
			return true;
		}
		return false;
	}

	
	

}
