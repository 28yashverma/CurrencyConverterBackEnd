package com.currencyConverter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currencyConverter.model.User;
import com.currencyConverter.repository.UserRepository;
import com.currencyConverter.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User u) {
		return userRepository.save(u);
	}

	@Override
	public List<User> users() {
		return userRepository.findAll();
	}

}
