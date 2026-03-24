package com.javanoo.dev.model;

import java.util.HashSet;

import org.springframework.stereotype.Component;

@Component
public class Project {
	
	private String projectName;
	private StringBuilder projectDescription;
	private HashSet<String> projectTools;
	
	public Project() {
		setProjectName("unknown");
		setProjectDescription(new StringBuilder("Nothing on this project."));
		setProjectTools(new HashSet<>());
		
		getProjectTools().add("nothing.");
	}
	
	public Project(String name, String description, String ...tools) {
		setProjectName(name);
		setProjectDescription(new StringBuilder(description));
		setProjectTools(new HashSet<>());
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public StringBuilder getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(StringBuilder projectDescription) {
		this.projectDescription = projectDescription;
	}

	public HashSet<String> getProjectTools() {
		return projectTools;
	}

	public void setProjectTools(HashSet<String> projectTools) {
		this.projectTools = projectTools;
	}
	
}
