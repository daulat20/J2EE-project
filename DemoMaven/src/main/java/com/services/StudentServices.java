package com.services;

import com.doa.StudentDao;

public class StudentServices {
	
	public void insertData() throws Exception {
		
		StudentDao s = new StudentDao();
		s.insertData();
	}

	public void updateData() throws Exception{
		StudentDao s = new StudentDao();
		s.updateData();
	}

	public void getAllData() throws Exception{
		StudentDao s = new StudentDao();
		s.getAllData();
		
	}

	public void deleteData() throws Exception{
		StudentDao s = new StudentDao();
		s.deleteData();
		
	}

}
