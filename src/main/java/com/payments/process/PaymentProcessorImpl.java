package com.payments.process;

import org.springframework.stereotype.Component;

@Component
public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public String processPayment(String paymentrequest) {
		String response="";
		 if (paymentrequest.contains("login")) {
         	
         } else if (paymentrequest.contains("topup")) {
         	
         } else if (paymentrequest.contains("pay")) {
        	 
         }
		return response;
	}


}
