package com.payments.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.payments.model.User;
import com.payments.repository.UserRepository;
import com.payments.service.UserSerivce;


public class UserServiceImpl implements UserSerivce {
	@Autowired
	private UserRepository userRepository;

	@Override
	public Optional<User> findById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public Long createNewUser(User users) {
		// TODO Auto-generated method stub
		return null;
	}


}
