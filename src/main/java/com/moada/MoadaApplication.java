package com.moada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MoadaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoadaApplication.class, args);
	}

}
