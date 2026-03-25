package com.javanoo.dev.repository;

import java.util.LinkedHashSet;

import org.springframework.stereotype.Repository;

import com.javanoo.dev.model.Project;

@Repository
public class ProjectsRepo {
	
	ProjectsRepo(){}
	
	public LinkedHashSet<Project> getProjects(String filterType, String filter){
		return fetch( filterType, filter);
	}
	
	//dummy routines for testing, needs changing!!
	protected LinkedHashSet<Project> fetch(String filterType, String filter){
		
		LinkedHashSet<Project> projects = new LinkedHashSet<>();
		for(int i = 4; i > 0; i--){
			projects.add(new Project(i, "dummyProject"+i,
										"This is a dummy project, for testing.",
										"backend", 
										new String[]{"springboot", "spring", "mysql"}));
		}
		
		return projects;
	
	}
}
