package com.javanoo.dev.service;

import java.util.LinkedHashSet;

import org.springframework.stereotype.Service;

import com.javanoo.dev.model.Project;
import com.javanoo.dev.proxy.FetchProjectsProxy;

@Service 
public class FetchProjectsService {
 
	private FetchProjectsProxy fetchProjectsProxy;
	
	public FetchProjectsService(FetchProjectsProxy fetchProjectsProxy) {
		this.fetchProjectsProxy = fetchProjectsProxy;
	}
	
	public LinkedHashSet<Project> fetchProjects(){
		return fetchProjectsProxy.fetch(null);
	}
	
	public LinkedHashSet<Project> fetchProjectsFilteredBy(String filter){
		return fetchProjectsProxy.fetch(filter);
	}
}