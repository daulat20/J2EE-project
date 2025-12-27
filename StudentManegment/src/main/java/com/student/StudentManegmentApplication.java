package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.student.model")
@EnableJpaRepositories("com.student.repository")
public class StudentManegmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManegmentApplication.class, args);
		System.err.println("Application Stared");
	}

}
