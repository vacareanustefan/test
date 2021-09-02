package com.codacy.test.Repository;

import com.codacy.test.Domain.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TodoRepository extends CrudRepository<Todo, Long> {

    //List<Todo> findAll(); - this is already implemented in CrudRepository with name findAll();
    //Todo createTodo(Todo t); - implemented in CrudRepository with name save(Todo t);
    //Todo getTodoById(Long id); - implemented as findById(Long id);
    //Todo deleteTodo(Todo t); - implemented both as delete(Todo t) and deleteById(Long id)

    // the update is not implemented so I'll make it manually
    //Todo updateTodo(Todo t);
}
