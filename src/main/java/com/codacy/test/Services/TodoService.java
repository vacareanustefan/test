package com.codacy.test.Services;

import com.codacy.test.Domain.Todo;
import org.modelmapper.ModelMapper;

import java.util.List;

public interface TodoService {
    List<TodoDTO> getAllTodos();
    TodoDTO create(TodoDTO t);
    TodoDTO update(TodoDTO t);
    void delete(Long id);
    TodoDTO getById(Long id);

}
