package com.payments.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payments.model.User;
import com.payments.service.UserSerivce;

@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserSerivce userService;
	
	@PostMapping("/users")
	public ResponseEntity<Long> createUser(@RequestBody User users,HttpServletRequest request) {
		//Long user = 
		if(userService.findById(users.getId()).isPresent()) {
			return new ResponseEntity<Long>(HttpStatus.BAD_REQUEST);
		}
		Long userid = userService.createNewUser(users);
		return new ResponseEntity<Long> (userid,HttpStatus.CREATED);
	}
}
