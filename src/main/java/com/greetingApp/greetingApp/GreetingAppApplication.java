package com.greetingApp.greetingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class GreetingAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(GreetingAppApplication.class, args);
	}

}
