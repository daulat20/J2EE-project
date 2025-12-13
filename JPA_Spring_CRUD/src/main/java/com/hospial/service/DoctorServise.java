package com.hospial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospial.entity.DoctorEntity;

@Service
public interface DoctorServise {
	
	@Autowired
	public boolean adddoctor(DoctorEntity d);
	@Autowired
	public List<DoctorEntity> getDoctorDetail();
	@Autowired
	DoctorEntity getdetail(int id);
	@Autowired
	public boolean updetails(int id ,String name , String email);
		
	
	
	

}
