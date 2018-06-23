package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud")
public class UserController {

	@RequestMapping("/user")
	public @ResponseBody User getUser() {
		return new User("POI000987", "Manvendra Singh");
	}
	
}
