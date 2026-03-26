package com.javanoo.dev;

import java.util.LinkedHashSet;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import org.springframework.ui.Model;
import org.springframework.util.Assert;

import com.javanoo.dev.model.Project;
import com.javanoo.dev.service.FetchProjectsService;

@ExtendWith(MockitoExtension.class)
public class DevControllerUnitTests {
	
	@Mock
	private FetchProjectsService fetchProjectsService;
	
	@Mock
	private Model model;
	
	@InjectMocks
	DevController devController;
	
	@Test
	@DisplayName("Testing home method's happyflow")
	public void homeTest() {
		
		String result = devController.home();
		assertEquals("home.html", result);
	}
	
	@Test
	@DisplayName("Testing projects method's happyflow")
	public void projectsTest() {
		
		LinkedHashSet<Project> listOfProjects = new LinkedHashSet<>();
		
		//assumptions
		given(fetchProjectsService.fetchProjects("filterType", "filter")).willReturn(listOfProjects);
		
		//call
		String result = devController.projects("filterType","filter",model);
		
		//validate
		verify(model).addAttribute("projects", listOfProjects);
		assertEquals("projects.html", result);
	}
	
	@Test
	@DisplayName("Testing collaborate method's happyflow")
	public void collaborateTest() {
		String result = devController.collaborate();
		Assert.isTrue(result.equals("collaborate.html"), "success");
	}
}
