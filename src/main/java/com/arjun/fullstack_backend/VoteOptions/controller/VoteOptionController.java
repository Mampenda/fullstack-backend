package com.arjun.fullstack_backend.VoteOptions.controller;


import com.arjun.fullstack_backend.VoteOptions.exception.VoteOptionNotFoundException;
import com.arjun.fullstack_backend.VoteOptions.model.VoteOption;
import com.arjun.fullstack_backend.VoteOptions.repository.VoteOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000") /*Connect to front-end*/
public class VoteOptionController {

    @Autowired
    private VoteOptionRepository voteOptionRepository;

    // POST - posts vote option data and returns posted data
    @PostMapping("/voteoption")
    VoteOption newVoteOption(@RequestBody VoteOption voteOption) { return voteOptionRepository.save(voteOption); }

    // GET - gets all vote options from database
    @GetMapping("/voteoptions")
    List<VoteOption> getAllVoteOptions() { return voteOptionRepository.findAll(); }

    // GET BY ID - gets vote option by id
    @GetMapping("/voteoption/{id}")
    VoteOption getVoteOptionById(@PathVariable Long id) {
        return voteOptionRepository.findById(id)
                .orElseThrow(() -> new VoteOptionNotFoundException(id));
    }

    // DELETE - delete vote option by id
    @DeleteMapping("/voteoption/{id}")
    String deleteVoteOptionById(@PathVariable Long id) {

        //Throw exception if the user does not exist
        if(!voteOptionRepository.existsById(id)) { throw new VoteOptionNotFoundException(id); }

        //Delete user
        voteOptionRepository.deleteById(id);
        return "Vote option with id " + id +  " has been deleted successfully.";
    }
}