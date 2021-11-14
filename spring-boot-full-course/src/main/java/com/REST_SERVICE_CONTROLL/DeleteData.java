package com.REST_SERVICE_CONTROLL;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteData {
	
	@DeleteMapping(value = "/api/users/{id}")
	public String deleteUser(@PathVariable("id") String id) {
		return id;
	}
}
