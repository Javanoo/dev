package com.javanoo.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DevController {

	@GetMapping("/")
	public String home() {
		return "home.html";
	}
	
	@GetMapping("/projects")
	public String projects() {
		return "projects.html";
	}
	
	@GetMapping("/collaborate")
	public String collaborate() {
		return "collaborate.html";
	}
	
}