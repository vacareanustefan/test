package com.codacy.test.Services;

import com.codacy.test.Domain.Todo;
import com.codacy.test.Domain.User;
import lombok.Data;

@Data
public class TodoDTO {
    private Long id;
    private String title;
    private boolean completed;
    private User user;

    protected TodoDTO() {}

    public TodoDTO(Long id, String title, boolean completed, User user){
        this.id = id;
        this.title = title;
        this.completed = completed;
        this.user = user;
    }

    public TodoDTO(String title, boolean completed, User user){
        this.title = title;
        this.completed = completed;
        this.user = user;
    }
}
