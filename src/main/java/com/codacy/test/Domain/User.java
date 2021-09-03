package com.codacy.test.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Todo> todos;

    protected User() {}

    public User(String username) {
        this.username = username;
    }

    @Override
    public String toString(){
        return "{ id: " + this.id.toString() + ", username: " + this.username + " }";
    }
}
