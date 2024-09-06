package com.arjun.fullstack_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;

//import java.util.ArrayList;
//import java.util.List;

@Entity
public class User {
    //Generate ID automatically
    @Id
    @GeneratedValue
    private Long id;

//    @OneToMany
//    private List<E> polls = new ArrayList<E>();

    //User fields
    private String name;
    private String username;
    private String email;
    private String password;

    //Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

//    public String getPolls() { return polls; }
//    public void setPolls(List<E> polls) { this.polls = polls; }
}
