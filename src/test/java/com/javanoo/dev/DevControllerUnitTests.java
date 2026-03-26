package com.javanoo.dev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.Assert;

import com.javanoo.dev.service.FetchProjectsService;

@ExtendWith(MockitoExtension.class)
public class DevControllerUnitTests {
	
	@Mock
	FetchProjectsService fetchProjectsService;
	
	@InjectMocks
	DevController devController;
	
	@Test
	@DisplayName("Testing whether the home method runs correctly in a happyflow")
	public void homeTest() {
		
		String result = devController.home();
		Assert.isTrue(result.equals("home.html"), "success");
	}
}
