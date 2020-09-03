package com.payments.repository;

import org.springframework.data.repository.CrudRepository;

import com.payments.model.User;


public interface UserRepository extends CrudRepository<User, Long> {

}
