package com.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
	public void insertData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch412","root","Daulat@@6920");
		Statement s = con.createStatement();
		s.executeUpdate("insert into studentinfo (rollno , name , city , gender) values (105,'sanika','mumbai','female')");
		System.out.println("Insert data");
		
		con.close();
		s.close();
		
	}

	public void updateData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch412","root","Daulat@@6920");
		Statement s = con.createStatement();
		s.executeUpdate("update studentinfo set name='rohit' where rollno=101");
		System.out.println("update data");
		
		con.close();
		s.close();
		
	}

	public void getAllData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch412","root","Daulat@@6920");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from studentinfo");
		
		System.out.println("\nRoll_No\tName\tCity\tGender");
        System.out.println("----------------------------");
		while(rs.next()) {
			
			System.out.println(rs.getInt("rollno") + "\t"+ rs.getString("name")+"\t"+ rs.getString("city")+"\t"+ rs.getString("gender"));
			
		}
		
		con.close();
		s.close();
		
	}

	public void deleteData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch412","root","Daulat@@6920");
		Statement s = con.createStatement();
		s.executeUpdate("delete from studentinfo where rollno = 104");
		System.out.println("Delete Student data");
		
	}

}
