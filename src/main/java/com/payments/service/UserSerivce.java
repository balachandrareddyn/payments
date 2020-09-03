package com.payments.service;

import java.util.Optional;

import com.payments.model.User;


public interface UserSerivce {

	Optional<User> findById(Long id);

	Long createNewUser(User users);

}
