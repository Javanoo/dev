package com.javanoo.dev.proxy;

import java.util.LinkedHashSet;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javanoo.dev.model.Project;

@FeignClient(name = "fetchprojects", url = "localhost" )
public interface FetchProjectsProxy {
	
	@PostMapping("/projects")
	LinkedHashSet<Project> fetch(@RequestParam(required = false) String filter);
}
