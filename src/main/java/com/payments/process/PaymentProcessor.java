package com.payments.process;

public interface PaymentProcessor {
	
	public abstract String processPayment(String paymentInput);

}
