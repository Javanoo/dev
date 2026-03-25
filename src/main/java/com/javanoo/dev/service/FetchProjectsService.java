package com.javanoo.dev.service;

import java.util.LinkedHashSet;

import org.springframework.stereotype.Service;

import com.javanoo.dev.model.Project;
import com.javanoo.dev.repository.ProjectsRepo;

@Service 
public class FetchProjectsService {
 
	private final ProjectsRepo projectsRepo;
	
	public FetchProjectsService(ProjectsRepo projectsRepo) {
		this.projectsRepo = projectsRepo;
	}
	
	public LinkedHashSet<Project> fetchProjects(String filterType, String filter){
		return projectsRepo.getProjects(filterType, filter);
	}
}