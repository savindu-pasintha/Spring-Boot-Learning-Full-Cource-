package com.REST_SERVICE_CONTROLL;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostData {

	@PostMapping(value = "/api/users")
	public String postUser(String s) {
		return s;
	}
}
