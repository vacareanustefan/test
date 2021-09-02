package com.codacy.test.Controller;

import com.codacy.test.Services.TodoDTO;
import com.codacy.test.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoservice;

    @GetMapping("/todo/getAll")
    public List<TodoDTO> getAllTodos(){
        return todoservice.getAllTodos();
    }

    @PostMapping("/todo/create")
    public TodoDTO create(@RequestBody TodoDTO t){
        return todoservice.create(t);
    }

    @GetMapping("/todo/get/{id}")
    public TodoDTO getById(@PathVariable("id") Long id){
        return todoservice.getById(id);
    }

    @PostMapping("/todo/update")
    public TodoDTO update(@RequestBody TodoDTO t){
        return todoservice.update(t);
    }
    @DeleteMapping("/todo/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        todoservice.delete(id);
    }

}
