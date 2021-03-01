package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/quiubo")
	public String hello() {
		return "Entonces que friend ?? ";
	}
	
}
