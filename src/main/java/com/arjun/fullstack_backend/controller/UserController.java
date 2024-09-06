package com.arjun.fullstack_backend.controller;

import com.arjun.fullstack_backend.model.User;
import com.arjun.fullstack_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // POST - posts data and returns posted data
    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    // GET - gets all user data from database
    @GetMapping("/users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
