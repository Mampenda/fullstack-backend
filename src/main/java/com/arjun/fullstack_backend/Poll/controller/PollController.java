package com.arjun.fullstack_backend.Poll.controller;

import com.arjun.fullstack_backend.Poll.model.Polls;
import com.arjun.fullstack_backend.Poll.repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("http://localhost:3000") /*Connect to front-end*/
public class PollController {

    @Autowired
    private PollRepository pollRepository;

    // GET - gets all polls from database
    @GetMapping("/polls")
    List<Polls.Poll> getAllPolls() {
        return pollRepository.findAll();
    }

}
