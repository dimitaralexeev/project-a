package com.example.projectatest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaySomethingCotroller {
	
	@GetMapping(path = "/")
	public String saySomething() {
		return "I want to say something!";
	}
	
}
