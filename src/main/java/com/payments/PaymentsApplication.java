package com.payments;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.payments.process.PaymentProcessor;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Data
@Slf4j
public class PaymentsApplication implements CommandLineRunner {

	@Autowired
	private PaymentProcessor paymentProcessor;

	public static void main(String[] args) {
		SpringApplication.run(PaymentsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String requst = "";
		String response = "";
		System.out.println("Commandliner interface");
		Scanner scanner = new Scanner(System.in);
		System.out.println(">");

		while (!(requst = scanner.next()).equalsIgnoreCase("exit")) {
			response = paymentProcessor.processPayment(requst);

			System.out.println(processResponse(response));

		}
		System.out.println("Shuting down!");
		System.exit(1);
	}

	// this can be written in util for formater
	public String processResponse(String response) {
		String processedResponse = response.replaceAll(" ", "\n");
		return processedResponse;
	}

}
