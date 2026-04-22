package com.javanoo.dev;

import java.util.LinkedHashSet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javanoo.dev.model.Email;
import com.javanoo.dev.model.Project;
import com.javanoo.dev.service.FetchProjectsService;
import com.javanoo.dev.service.MailingService;

@Controller
public class DevController {
	
	private final FetchProjectsService fetchProjectsService;
	private final MailingService mailingService;
	
	public DevController(FetchProjectsService fetchProjectsService, 
						MailingService mailingService) {
		this.fetchProjectsService = fetchProjectsService;
		this.mailingService = mailingService;
	}

	@GetMapping("/")
	public String home() {
		return "home.html";
	}
	
	@GetMapping("/projects")
	public String projects(
			@RequestParam(required = false) String filter,
			Model page) {
		LinkedHashSet<Project> projects;
		
		if((filter != null && !filter.isBlank())) {
			projects = fetchProjectsService.fetchProjects(filter); 
		}else {
			projects = fetchProjectsService.fetchProjects("true");
		}
		
		page.addAttribute("projects", projects);
		return "projects.html";
	}
	
	@GetMapping("/collaborate")
	public String collaborate() {
		return "collaborate.html";
	}
	
	@PostMapping("/collaborate")
	public String collaborate(
			@RequestParam(required = false) String emailAddress, 
			@RequestParam(required = false) String emailSubject,
			@RequestParam(required = false) String emailMessage) {
		//only store valid email
		if(emailAddress != null && emailSubject != null && emailMessage !=null)
		 if(!(emailAddress.isBlank() || emailSubject.isBlank() || emailMessage.isBlank())){
		 	 Email email = new Email();
			 email.setEmailAddress(emailAddress);
			 email.setEmailSubject(emailSubject);
			 email.setEmailMessage(emailMessage);
			 mailingService.storeEmail(email);
		 }
		//then call collaborate
		return collaborate();
	}
}