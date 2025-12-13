package com.hospial.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospial.entity.DoctorEntity;

public interface DoctorDao extends JpaRepository<DoctorEntity, Integer> {
	 

}
