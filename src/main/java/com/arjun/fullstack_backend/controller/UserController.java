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

    // EDIT - editing the user
    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id) {

        //Map creates a new array from calling a function for every element
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(newUser.getName());
                    user.setUsername(newUser.getUsername());
                    user.setEmail(newUser.getEmail());
                    user.setPassword(newUser.getPassword());

                    //Save the existing user into the database
                    return userRepository.save(user);

                //Or throw custom exception
                }).orElseThrow(() -> new UserNotFoundException(id));
    }

    // DELETE - delete user by id
    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id) {

        //Throw exception if the user does not exist
        if(!userRepository.existsById(id)) { throw new UserNotFoundException(id); }

        //Delete user
        userRepository.deleteById(id);
        return "User with id " + id +  " has been deleted successfully.";
    }
}
