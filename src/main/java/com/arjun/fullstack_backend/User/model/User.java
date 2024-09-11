package com.arjun.fullstack_backend.User.model;

import com.arjun.fullstack_backend.Polls.model.Poll;
import jakarta.persistence.*;

import java.util.List;

/*
@Entity marks a class as an entity, indicating it should persist in a database.
@Table specifies details about the database table associated with the entity.
*/
@Entity
@Table(name="users")
public class User {
    //Generate ID automatically
    @Id
    @GeneratedValue
    private Long id;

    //User fields
    private String name;
    private String username;
    private String email;
    private String password;

    //One user to many polls
    @OneToMany(mappedBy = "creator")
    private List<Poll> polls;

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

    public List<Poll> getPolls() { return polls; }
    public void setPolls(List<Poll> polls) { this.polls = polls; }
}
