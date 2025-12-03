package com.controllar;

import com.services.StudentServices;

public class StudentControllar {
	public static void main(String[] args) throws Exception {
		
		StudentServices s = new StudentServices();
//		s.insertData();
//		s.updateData();
//		s.deleteData();
		s.getAllData();
	}

}
