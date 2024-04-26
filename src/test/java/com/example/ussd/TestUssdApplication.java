package com.example.ussd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestUssdApplication {

	public static void main(String[] args) {
		SpringApplication.from(UssdApplication::main).with(TestUssdApplication.class).run(args);
	}

}
