package com.instagram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.enity.Instagram;
import com.instagram.service.InstagramService;

@RestController
public class InstagramController {

	@Autowired
	InstagramService service;

	@PostMapping("/register")
	public String register(@RequestBody Instagram i) {
		return service.register(i);
	}

	@GetMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password) {

		return service.login(username, password);
		
	}
	
	@PutMapping("/updatedata/{id}")
	public String updataccout(@RequestBody Instagram i ,  @PathVariable int id) {
		
		return service.updateaaccount(i, id);
		
	}
	@GetMapping("/getAllData")
	public List<Instagram> getAllData() {

		return service.getAllData();
	}
	@DeleteMapping("/deleteData/{id}")
	public String deleteData(@PathVariable int id) {

		String msg = service.deleteData(id);

		return msg;

	}
	

}
