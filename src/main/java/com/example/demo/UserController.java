package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud")
public class UserController {

	private UserService userservice;
	ArrayList<User> al=new ArrayList<User>();  

	@Autowired
	public UserController(UserService userservice) {
		super();
		this.userservice = userservice;
	}
//Test
	@RequestMapping("/user")
	public @ResponseBody User getUser() {
		User u =new  User("POI000987", "Manvendra Singh");
		return userservice.getUser(u);

	}
	
		@RequestMapping("/all")
	public @ResponseBody List<User> getAllUser() {
		User u1 =new  User("POI000987", "WIPRO");
		User u2 =new  User("POI000981", "TCS");
		al.add(u1);
		al.add(u2);
		return al;

	}
	
	
}
