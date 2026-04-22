package com.javanoo.dev.model;

import java.util.HashSet;

import org.springframework.data.annotation.Id;

public class Project {
	
	@Id
	private Integer projectId;
	private String projectName;
	private StringBuilder projectDescription;
	private HashSet<String> projectTools;
	private String projectType;
	
	public Project() {
		setProjectId(0);
		setProjectName("unknown");
		setProjectDescription(new StringBuilder("Nothing on this project."));
		setProjectTools(new HashSet<>());
		setProjectType("unknown");
		
		getProjectTools().add("nothing.");
	}
	
	public Project(Integer Id, String name, String description, String type, String ...tools) {
		setProjectId(Id);
		setProjectName(name);
		setProjectDescription(new StringBuilder(description));
		setProjectTools(new HashSet<>());
		setProjectType(type);
	}
	
	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
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
