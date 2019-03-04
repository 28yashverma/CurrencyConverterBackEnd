package com.currencyConverter.service;

import java.util.List;

import com.currencyConverter.model.User;

public interface UserService {

	public User createUser(User u);
	
	public List<User> users();

}
