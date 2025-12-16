package com.amazon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.dao.AmazonDao;
import com.amazon.entity.AmazonUser;

@Service
public class AmazonService {
	@Autowired
	AmazonDao dao;

	public AmazonUser addUser(AmazonUser u) {
		return dao.save(u);

	}
	
	public List<AmazonUser> getAllUser(){
		return dao.findAll();
		
	}
	
	public AmazonUser updatedata(AmazonUser u , int id) {
		Optional<AmazonUser> optionalUser = dao.findById(id);

		if (optionalUser.isPresent()) {
		    AmazonUser a = optionalUser.get();
		    a.setName(u.getName());
		    a.setEmail(u.getEmail());
		    a.setAddress(u.getAddress());
		    a.setPhno(u.getPhno());
		    
		    return dao.save(a);
		} else {
		    throw new RuntimeException("User not found");
		}

	}
	
	public void deletedata( int id) {
		 dao.deleteById(id);;
	}

	public AmazonUser getSingleUser(int id) {
		
		return dao.getById(id);
	}
}
