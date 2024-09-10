package com.arjun.fullstack_backend.Polls.repository;

import com.arjun.fullstack_backend.Polls.model.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollsRepository extends JpaRepository<Poll, Long> {

}
