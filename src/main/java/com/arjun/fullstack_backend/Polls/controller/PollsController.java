package com.arjun.fullstack_backend.Polls.controller;


import com.arjun.fullstack_backend.Polls.exception.PollNotFoundException;
import com.arjun.fullstack_backend.Polls.repository.PollsRepository;
import com.arjun.fullstack_backend.Polls.model.Poll;
import com.arjun.fullstack_backend.User.exception.UserNotFoundException;
import com.arjun.fullstack_backend.User.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000") /*Connect to front-end*/
public class PollsController {

    @Autowired
    private PollsRepository pollRepository;

    private static final Logger logger = LoggerFactory.getLogger(PollsController.class);
    // POST - posts poll data and returns posted data
    @PostMapping("/poll")
    public Poll newPoll(@RequestBody Poll newPoll) {
        logger.info("Received new poll: {}", newPoll.getQuestion());
        return pollRepository.save(newPoll); }

    // GET - gets all polls from database
    @GetMapping("/polls")
    public List<Poll> getAllPolls() { return pollRepository.findAll(); }

    // GET BY ID - gets poll by id
    @GetMapping("/poll/{id}")
    public Poll getPollById(@PathVariable Long id) {
        return pollRepository.findById(id)
                .orElseThrow(() -> new PollNotFoundException(id));
    }

    // EDIT - editing the poll
    @PutMapping("/poll/{id}")
    Poll updatePoll(@RequestBody Poll newPoll, @PathVariable Long id) {

        //Map creates a new array from calling a function for every element
        return pollRepository.findById(id)
                .map(poll -> {
                    poll.setQuestion(newPoll.getQuestion());
                    poll.setCreator(newPoll.getCreator());
                    poll.setVoteOptions(newPoll.getVoteOptions());

                    //Save the existing user into the database
                    return pollRepository.save(poll);

                    //Or throw custom exception
                }).orElseThrow(() -> new PollNotFoundException(id));
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