package com.arjun.fullstack_backend.VoteOptions.repository;

import com.arjun.fullstack_backend.VoteOptions.model.VoteOption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteOptionRepository extends JpaRepository<VoteOption, Long> {

}