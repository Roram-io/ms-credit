package com.nttdata.credits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class CreditsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditsApplication.class, args);
	}

}
