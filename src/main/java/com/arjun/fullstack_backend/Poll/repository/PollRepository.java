package com.arjun.fullstack_backend.Poll.repository;

import com.arjun.fullstack_backend.Poll.model.Polls;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollRepository extends JpaRepository<Polls.Poll, Long> {
}
