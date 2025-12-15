package com.instagram.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.dao.InstagramDao;
import com.instagram.enity.Instagram;

@Service
public class InstagramService {
	@Autowired
	InstagramDao dao;

	public String register(Instagram i) {
		String msg = dao.register(i);

		if (Objects.isNull(msg)) {
			msg = "data not inserted";
		}
		return msg;

	}

	public String login(String username , String password) {
		Instagram i = dao.login(username , password);

		if (i != null) {
			return "Login Successful";
		}else {
			return "Invalid Username or Password";
		}
		
	}
	
	public String updateaaccount(Instagram i , int id) {
		
		String msg = dao.updateaccount(i, id);
		
		if(Objects.isNull(msg)) {
			return "data not update...";
		}
		return msg;
		
	}

	public List<Instagram> getAllData() {
		
		return dao.getAllData();
	}
	public String deleteData(int id) {
		String msg = dao.deleteaccount(id);
		if (Objects.isNull(msg)) {
			msg = "Data not deleted...!";
		}
		return msg;
	}
	

}
