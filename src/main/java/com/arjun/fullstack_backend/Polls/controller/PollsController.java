package com.arjun.fullstack_backend.Polls.controller;


import com.arjun.fullstack_backend.Polls.exception.PollNotFoundException;
import com.arjun.fullstack_backend.Polls.repository.PollsRepository;
import com.arjun.fullstack_backend.Polls.model.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000") /*Connect to front-end*/
public class PollsController {

    @Autowired
    private PollsRepository pollRepository;

    // POST - posts poll data and returns posted data
    @PostMapping("/poll")
    Poll newPoll(@RequestBody Poll newPoll) { return pollRepository.save(newPoll); }

    // GET - gets all polls from database
    @GetMapping("/polls")
    List<Poll> getAllPolls() { return pollRepository.findAll(); }

    // GET BY ID - gets poll by id
    @GetMapping("/poll/{id}")
    Poll getPollById(@PathVariable Long id) {
        return pollRepository.findById(id)
                .orElseThrow(() -> new PollNotFoundException(id));
    }

    // DELETE - delete poll{ by id
    @DeleteMapping("/poll/{id}")
    String deletePoll(@PathVariable Long id) {

        //Throw exception if the user does not exist
        if(!pollRepository.existsById(id)) { throw new PollNotFoundException(id); }

        //Delete user
        pollRepository.deleteById(id);
        return "Poll with id " + id +  " has been deleted successfully.";
    }
}