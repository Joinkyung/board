package com.basic.back_end.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BackEndBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndBasicApplication.class, args);
	}

}
