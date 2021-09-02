package com.codacy.test;

import com.codacy.test.Domain.Todo;
import com.codacy.test.Domain.User;
import com.codacy.test.Repository.TodoRepository;
import com.codacy.test.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

//    @Bean
//    public ModelMapper modelMapper() {
//        return new ModelMapper();
//    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner mappingDemo(TodoRepository todoRepo, UserRepository userRepo){
        return args -> {
            User user = new User("george");
            userRepo.save(user);
            Todo todo1 = new Todo("clean",false,user);
            Todo todo2 = new Todo("walk", true, user);
           // Long id_todo = 5;
            todoRepo.save(todo1);
            todoRepo.save(todo2);
            todoRepo.save(new Todo(todo2.getId(), "test de update cu succes", true, todo2.getUser()));
        };
    }
}
