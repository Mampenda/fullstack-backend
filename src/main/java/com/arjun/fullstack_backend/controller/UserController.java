package com.arjun.fullstack_backend.controller;

import com.arjun.fullstack_backend.exception.UserNotFoundException;
import com.arjun.fullstack_backend.model.User;
import com.arjun.fullstack_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000") /*Connect to front-end*/
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

    // DELETE - deletes user from database
    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }
}
