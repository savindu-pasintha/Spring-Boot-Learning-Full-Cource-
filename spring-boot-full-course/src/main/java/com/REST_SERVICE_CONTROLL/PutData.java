package com.REST_SERVICE_CONTROLL;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PutData {
	
	@PutMapping(value = "/api/users/{id}")
	public String putUser(@PathVariable("id") String id) {
		return id;
	}
}
