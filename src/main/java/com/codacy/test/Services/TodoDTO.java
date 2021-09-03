package com.codacy.test.Services;

import com.codacy.test.Domain.Todo;
import com.codacy.test.Domain.User;
import com.codacy.test.Repository.UserRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

//    public TodoDTO(String title, boolean completed, Long id_user){
//        this.title = title;
//        this.completed = completed;
//        this.user = repo.findById(id_user).get();
//    }
//
//    public TodoDTO(Long id, String title, boolean completed, Long id_user){
//        this.id = id;
//        this.title = title;
//        this.completed = completed;
//        this.user = repo.findById(id_user).get();
//    }

//    @Override
//    public String toString(){
//        return "{ id: " + this.id.toString() + ", title: " + this.title + ", completed" + this.completed + ", user: {" + "id: " + this.user.getId() + ", username: " + this.user.getUsername() + "}" + " }";
//    }
}
