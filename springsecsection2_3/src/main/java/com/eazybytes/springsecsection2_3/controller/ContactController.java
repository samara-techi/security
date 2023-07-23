package com.eazybytes.springsecsection2_3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/contact")
public class ContactController {
	
	@GetMapping("/")
	public String myContact() {
		return "myContact() @ContactController";
	}
}
