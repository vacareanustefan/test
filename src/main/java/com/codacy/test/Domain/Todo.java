package com.codacy.test.Domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "todos")
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private boolean completed;
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    protected Todo() {}

    public Todo(String title, boolean completed, User user){
        this.title = title;
        this.completed = completed;
        this.user = user;
    }
    public Todo(Long id, String title, boolean completed, User user){
        this.id = id;
        this.title = title;
        this.completed = completed;
        this.user = user;
    }

}
