package com.example.sona.docker.spring_docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/docker")
public class KafkaController {
	
	
	@GetMapping("/message")
	public String welcome() {
		return ("Welcome to sonaa!!");
	}

}
