package com.codacy.test.Services;

import com.codacy.test.Domain.Todo;
import com.codacy.test.Repository.TodoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepo;

    ModelMapper modelmapper = new ModelMapper();

    public TodoServiceImpl(TodoRepository todoRepo){
        super();
        this.todoRepo = todoRepo;
    }

    @Override
    public List<TodoDTO> getAllTodos() {
        List<Todo> list = (List<Todo>) todoRepo.findAll();
        return list.stream().map(todo -> modelmapper.map(todo, TodoDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public TodoDTO create(TodoDTO t) {
        Todo todo = todoRepo.save(convertDTOtoEntity(t));
        return convertEntitytoDTO(todo);
    }

    @Override
    public TodoDTO update(TodoDTO t) {
        Todo todo = todoRepo.save(convertDTOtoEntity(t));
        return convertEntitytoDTO(todo);
    }

    @Override
    public void delete(Long id) {
        todoRepo.deleteById(id);
    }

    @Override
    public TodoDTO getById(Long id) {
        Optional<Todo> optionalTodo = todoRepo.findById(id);
        Todo t = optionalTodo.get();
        return convertEntitytoDTO(t);
    }

    private Todo convertDTOtoEntity(TodoDTO t){
        Todo todo = modelmapper.map(t, Todo.class);
        return todo;
    }

    private TodoDTO convertEntitytoDTO(Todo t){
        TodoDTO tododto = modelmapper.map(t, TodoDTO.class);
        return tododto;
    }
}
