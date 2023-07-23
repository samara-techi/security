package com.eazybytes.springsecsection2_3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/loan")
public class LoansController {
	
	@GetMapping("/")
	public String loan() {
		return "loan() @LoansController";
	}

}
