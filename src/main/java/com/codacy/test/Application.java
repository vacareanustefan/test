package com.codacy.test;

import com.codacy.test.Controller.TodoController;
import com.codacy.test.Domain.User;
import com.codacy.test.Repository.UserRepository;
import com.codacy.test.Services.TodoDTO;
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
    public CommandLineRunner mappingDemo(TodoController controller, UserRepository userRepo){
        return args -> {
//            User user = new User("george");
//            userRepo.save(user);
//            Todo todo1 = new Todo("clean",false,user);
//            Todo todo2 = new Todo("walk", true, user);
//           // Long id_todo = 5;
//            todoRepo.save(todo1);
//            todoRepo.save(todo2);
//            todoRepo.save(new Todo(todo2.getId(), "test de update cu succes", true, todo2.getUser()));

            User user = new User("andrew");
            userRepo.save(user);
            User user1 = new User("steve");
            userRepo.save(user1);
//
            TodoDTO todo1 = new TodoDTO("working", false, user);
            controller.create(todo1);
            TodoDTO todo2 = new TodoDTO("watching tv", true, user);
            controller.create(todo2);
            TodoDTO todo3 = new TodoDTO("washing dishes", false, user1);
            controller.create(todo3);
            TodoDTO todo4 = new TodoDTO("playing football", true, user1);
            controller.create(todo4);
//            Long a = 2L;
//            TodoDTO todo2 = new TodoDTO(a, "merge service", false, user);
//            System.out.println(service.getById(2L));
//            System.out.println("linie---------------");
//            System.out.println(service.getAllTodos());
//            System.out.println("linie2---------------");
//            service.delete(2L);
//            System.out.println(service.getAllTodos());
//            System.out.println(controller.create(todo1));
//            System.out.println(controller.update(todo2));
//            System.out.println(controller.getById(2L));
//            System.out.println(controller.getAllTodos());
        };
    }
}
