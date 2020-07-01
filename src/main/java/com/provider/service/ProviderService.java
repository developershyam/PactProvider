package com.provider.service;

import org.springframework.stereotype.Service;

@Service
public class ProviderService {

	
	public String[] getUsers() {
		return new String[] {"Mike", "Jon"};
	}
}
