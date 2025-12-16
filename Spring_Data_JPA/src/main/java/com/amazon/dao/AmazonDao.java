package com.amazon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazon.entity.AmazonUser;

public interface AmazonDao extends JpaRepository<AmazonUser, Integer>{

}
