package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud")
public class UserController {
	
	private UserService userservice;
	
	@Autowired
	public UserController(UserService userservice) {
		super();
		this.userservice = userservice;
	}

	@RequestMapping("/user")
	public @ResponseBody User getUser() {
		User u =new  User("POI000987", "Manvendra Singh");
		return userservice.getUser(u);
		
	}
	
}
