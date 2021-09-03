package com.codacy.test.Controller;

import com.codacy.test.Services.TodoDTO;
import com.codacy.test.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService todoservice;

    @GetMapping("getAll")
    public List<TodoDTO> getAllTodos(){
        return todoservice.getAllTodos();
    }

    @PutMapping("create")
    public TodoDTO create(@RequestBody TodoDTO t){
        return todoservice.create(t);
    }

    @GetMapping("get/{id}")
    public TodoDTO getById(@PathVariable("id") Long id){
        return todoservice.getById(id);
    }

    @PatchMapping("update")
    public TodoDTO update(@RequestBody TodoDTO t){
        return todoservice.update(t);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") Long id){
        todoservice.delete(id);
    }

}
