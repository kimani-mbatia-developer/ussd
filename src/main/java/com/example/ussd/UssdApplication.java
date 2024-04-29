package com.example.ussd;

import com.example.ussd.domain.ussdSafaricomDB;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UssdApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(UssdApplication.class, args);
		ussdSafaricomDB t = new ussdSafaricomDB(792053976,"1");
		System.out.println(t.getPhoneNumber());

	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(UssdApplication.class);
	}


}
