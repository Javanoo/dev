package com.javanoo.dev;

import java.util.LinkedHashSet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javanoo.dev.model.Project;
import com.javanoo.dev.service.FetchProjectsService;
import com.javanoo.dev.service.MailingService;

@Controller
public class DevController {
	
	private final FetchProjectsService fetchProjectsService;
	private final MailingService mailingService;
	private String pageMode;
	
	public DevController(FetchProjectsService fetchProjectsService, 
						MailingService mailingService) {
		this.fetchProjectsService = fetchProjectsService;
		this.mailingService = mailingService;
	}

	@GetMapping("/")
	public String home(Model page) {
		pageMode = "home";
		page.addAttribute("pageMode", pageMode);
		page.addAttribute("aboutLink", "active");
		page.addAttribute("projectLink", "inactive");
		return "index.html";
	}
	
	@GetMapping("/projects")
	public String projects(
			@RequestParam(required = false) String filter,
			Model page) {
		LinkedHashSet<Project> projects;
		
		if((filter != null && !filter.isBlank())) {
			projects = fetchProjectsService.fetchProjects(filter);
		}else {
			projects = fetchProjectsService.fetchAllProjects();
		}
		
		pageMode = "projects";
		page.addAttribute("pageMode", pageMode);
		page.addAttribute("projectLink", "active");
		page.addAttribute("aboutLink", "inactive");
		page.addAttribute("projects", projects);
		return "index.html";
	}
	
}