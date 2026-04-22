package com.javanoo.dev.repository;

import java.util.LinkedHashSet;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javanoo.dev.model.Project;

@Repository
public interface ProjectsRepo extends CrudRepository<Project,Integer> {

	@Query("SELECT projectId, projectName, projectDescription, projectType, projectGithubLink FROM projects WHERE projectType = :projectType")
	LinkedHashSet<Project> fetchProjects(String projectType);
}
