package com.codacy.test;

import com.codacy.test.Domain.Todo;
import com.codacy.test.Domain.User;
import com.codacy.test.Repository.TodoRepository;
import com.codacy.test.Repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
