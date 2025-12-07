package Main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import oneToMany.Student;
import oneToMany.Teacher;

public class OneToMany {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Teacher.class);
		cfg.addAnnotatedClass(Student.class);
		
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
//		Teacher t = new Teacher();
//		t.setName("sagar");
//		
//		
//		Student s1 = new Student();
//		s1.setRollno(104);
//		s1.setName("shivam");
//		s1.setT(t);
//		
//		Student s2 = new Student();
//		s2.setRollno(105);
//		s2.setName("aj");
//		s2.setT(t);
//		
//		Student s3 = new Student();
//		s3.setRollno(106);
//		s3.setName("raj");
//		s3.setT(t);
//		
//		List<Student> list = new ArrayList<Student>();
//		list.add(s1);
//		list.add(s2);
//		list.add(s3);
//		
//		ss.persist(t);
//		ss.persist(s1);
//		ss.persist(s2);
//		ss.persist(s3);
//		t.setStud(list);
		
		int rollno=101;
		String query ="from Student where rollno =:rollno";
		Query<Student> q = ss.createQuery(query,Student.class);
		q.setParameter("rollno", rollno);
		Student s = q.getSingleResult();
		
		System.out.println(s);
		
		
		
//		System.out.println("data inserted..!");
		
		tr.commit();
		ss.close();
	}

}
