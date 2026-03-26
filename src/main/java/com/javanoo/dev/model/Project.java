package com.javanoo.dev.model;

import java.util.HashSet;

public class Project {
	
	private Integer projectID;
	private String projectName;
	private StringBuilder projectDescription;
	private HashSet<String> projectTools;
	private String projectType;
	
	public Project() {
		setProjectID(0);
		setProjectName("unknown");
		setProjectDescription(new StringBuilder("Nothing on this project."));
		setProjectTools(new HashSet<>());
		setProjectType("unknown");
		
		getProjectTools().add("nothing.");
	}
	
	public Project(Integer ID, String name, String description, String type, String ...tools) {
		setProjectID(ID);
		setProjectName(name);
		setProjectDescription(new StringBuilder(description));
		setProjectTools(new HashSet<>());
		setProjectType(type);
	}
	
	public Integer getProjectID() {
		return projectID;
	}

	public void setProjectID(Integer projectID) {
		this.projectID = projectID;
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
