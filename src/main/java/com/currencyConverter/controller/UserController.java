package com.currencyConverter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.currencyConverter.model.User;
import com.currencyConverter.service.UserService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/currency")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/greeting")
	public String sayHello() {
		return "hello from controller";
	}

	@RequestMapping(value = "/demoUser")
	public User demoUser() {
		return userService.createUser(new User("Yeshendra", 29, "Chinhat Lucknow", "India", "Lucknow"));
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getUsers() {
		return userService.users();
	}

}
