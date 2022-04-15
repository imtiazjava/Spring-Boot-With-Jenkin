package com.ems.pst.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	@GetMapping("/hello")
	public String greeting() {
		return  "Hello";
	}
}
