package com.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TicketExperimentApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketExperimentApplication.class, args);
	}

}
