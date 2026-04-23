package com.javanoo.dev.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("projects")
public class Project {
	
	@Id
	@Column("projectId")
	private Integer projectId;

	@Column("projectName")
	private String projectName;

	@Column("projectDescription")
	private String projectDescription;

	@Column("projectType")
	private String projectType;

	@Column("projectGithubLink")
	private String projectGithubLink;
	
	public String getProjectGithubLink() {
		return projectGithubLink;
	}

	public void setProjectGithubLink(String projectGithubLink) {
		this.projectGithubLink = projectGithubLink;
	}

	public Project() {
		setProjectId(0);
		setProjectName("unknown");
		setProjectDescription("Nothing about this project.");
		setProjectGithubLink("unknown");
		setProjectType("unknown");
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

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	
}
