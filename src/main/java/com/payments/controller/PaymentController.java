package com.payments.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.payments.service.PaymentSerivce;
import com.payments.service.UserSerivce;

public class PaymentController {

	@Autowired
	private PaymentSerivce paymentService;
	
}
