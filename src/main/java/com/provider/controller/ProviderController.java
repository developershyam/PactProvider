package com.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.provider.service.ProviderService;

@RestController
public class ProviderController {

	@Autowired
	ProviderService providerService;
	
	@GetMapping(value = "/test")
	public String test() {
		return "SUCCESS - Testing Spring Boot provider app !!";
	}
	
	@GetMapping(value = "/getUsers")
	public String[] getUsers() {
		return providerService.getUsers();
	}
	
}
