package com.jpa.orm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrmApplication.class, args);
	}
}
