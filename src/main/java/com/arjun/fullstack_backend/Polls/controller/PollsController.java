package com.arjun.fullstack_backend.Polls.controller;


import com.arjun.fullstack_backend.Polls.repository.PollsRepository;
import com.arjun.fullstack_backend.Polls.model.Poll;
import com.arjun.fullstack_backend.User.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000") /*Connect to front-end*/
public class PollsController {

    @Autowired
    private PollsRepository pollRepository;

    // POST - posts data and returns posted data
    @PostMapping("/poll")
    Poll newPoll(@RequestBody Poll newPoll) {
        return pollRepository.save(newPoll);
    }

    // GET - gets all user data from database
    @GetMapping("/polls")
    List<Poll> getAllPolls() {
        return pollRepository.findAll();
    }

    // DELETE - deletes user from database
//    @GetMapping("/poll/{id}")
//    Poll getPollById(@PathVariable Long id){
//        return pollRepository.findById(id)
//                .orElseThrow(() -> new PollNotFoundException(id));
//    }

//    // EDIT - editing the poll
//    @PutMapping("/poll/{id}")
//    Poll updatePoll(@RequestBody Poll newPoll, @PathVariable Long id) {
//
//        //Map creates a new array from calling a function for every element
//        return pollRepository.findById(id)
//                .map(poll -> {
//                    poll.setName(newPoll.getName());
//                    poll.setUsername(newPoll.getUsername());
//                    poll.setEmail(newPoll.getEmail());
//                    poll.setPassword(newPoll.getPassword());
//
//                    //Save the existing user into the database
//                    return pollRepository.save(poll);
//
//                    //Or throw custom exception
//                }).orElseThrow(() -> new PollNotFoundException(id));
//    }

    // DELETE - delete poll by id
    @DeleteMapping("/poll/{id}")
    String deletePoll(@PathVariable Long id) {

        //Throw exception if the user does not exist
        if(!pollRepository.existsById(id)) { throw new UserNotFoundException(id); }

        //Delete user
        pollRepository.deleteById(id);
        return "Poll with id " + id +  " has been deleted successfully.";
    }
}

