package com.home.demp.goboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Entry {
	
	@GetMapping("/hi")
	public String hiThere(){
		return "Hi, there! What's up!";
	}

}
