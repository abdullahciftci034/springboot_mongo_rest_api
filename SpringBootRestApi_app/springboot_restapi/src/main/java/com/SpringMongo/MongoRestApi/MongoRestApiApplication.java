package com.SpringMongo.MongoRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongoRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoRestApiApplication.class, args);
	}

}
