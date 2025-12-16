package com.amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.entity.AmazonUser;
import com.amazon.service.AmazonService;

@RestController
@RequestMapping("/amazon")
public class AmazonController {

	@Autowired
	AmazonService service;
	
	@PostMapping("/insert")
	public AmazonUser addUser(@RequestBody AmazonUser u) {
		return service.addUser(u);
		
	}
	
	@GetMapping("/getAll")
	public List<AmazonUser> getAllUser() {
		return service.getAllUser();
		
	}
	
	@GetMapping("/getSingledata/{id}")
	public AmazonUser getSingleUser(@PathVariable int id) {
		return service.getSingleUser(id);
		
	}
	
	@PutMapping("/update/{id}")
	public AmazonUser updatedata(@RequestBody AmazonUser u , @PathVariable int id) {
		return service.updatedata(u , id);
		
	}
	
	@DeleteMapping("/deletedata/{id}")
	public String deletedata(@PathVariable int id) {
		service.deletedata(id);
		return "data is deleted";
	}
	
}
