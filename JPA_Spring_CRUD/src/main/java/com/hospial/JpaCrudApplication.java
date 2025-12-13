package com.hospial;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hospial.dao.DoctorDao;
import com.hospial.service.DoctorServiceImp;
import com.hospial.service.DoctorServise;

@SpringBootApplication
public class JpaCrudApplication {

//    private final DoctorDao doctorDao;
//
//    JpaCrudApplication(DoctorDao doctorDao) {
//        this.doctorDao = doctorDao;
//    }

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaCrudApplication.class, args);
		DoctorServise d = context.getBean(DoctorServiceImp.class);
		
		
//	===========INsert DAta========
//		DoctorEntity de = new DoctorEntity();
//		de.setName("Daulat");
//		de.setEmail("daulat@gmail.com");
//		de.setSpecialization("Orthopedic Surgeon");
//		boolean status = d.adddoctor(de);
//
//		if (status)
//			System.out.println("Data inserted");
//		else
//			System.out.println("Data not insertde");
		
//		=======select data=======
		
//		List<DoctorEntity> list = d.getDoctorDetail();
//		System.out.println(list);
//		System.out.println("\r");
		
		
//		==========Select singal data data===========
		
		
//		 Object s = d.getdetail(1);
//		
//		 
//		if(s!=null) {
//			System.out.println(s);
//		}else {
//			System.out.println("data not updated");
//		}
		
//		===========update data========
		boolean status = d.updetails(2, "ashish" , "ashu@gmail.com");
		if(status)
			System.out.println("data updated.....!");
		else
			System.out.println("data not updated");
		
		
		
	}

}
