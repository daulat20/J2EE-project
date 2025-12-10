package com.firstapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Amazon")
public class MyControler {

	@GetMapping("/sell")
	String firstApi() {
		return "All Electronic Accessories are 25% discount";
		
	}
	@PostMapping("/laptop")
	String SecondApi() {
		return "Apple 2025 MacBook Air , Apple 2025 MacBook Pro Laptop with M5 chip";
		
	}
	@PutMapping("/Mobail")
	String ThirdApi() {
		return "vivo , Apple iPhone 15 ";
		
	}
	@GetMapping("/Watch")
	String forthApi() {
		return "Noise ,	casio , Shocknshop";
		
	}
	
}
