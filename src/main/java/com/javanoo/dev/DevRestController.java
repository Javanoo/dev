package com.javanoo.dev;

import java.util.LinkedHashSet;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javanoo.dev.model.Email;
import com.javanoo.dev.model.Project;

@RestController
public class DevRestController {

	
	
	@GetMapping("/projects/{filterType}/{filter}")
	public ResponseEntity<LinkedHashSet<Project>> getProjects(
			@PathVariable String filterType,
			@PathVariable String filter
			){
		LinkedHashSet<Project> setOfProjects = fetch(filterType, filter);
		return ResponseEntity.status(HttpStatus.OK).body(setOfProjects);	
	}
	
	@GetMapping("/collaborate")
	public ResponseEntity<?> sendEmail (
			@RequestBody Email email){
		return null;
	}
	
	private LinkedHashSet<Project> fetch(String filterType, String filter){
		return null;
	}
}