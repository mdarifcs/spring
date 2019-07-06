package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class MainController {

	@GetMapping("/getMsg")
	public String greeting() {
		return "spring security example";
	}
	
}
