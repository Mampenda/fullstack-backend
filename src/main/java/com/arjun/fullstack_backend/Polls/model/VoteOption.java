//package com.arjun.fullstack_backend.Polls.model;
//
//import jakarta.annotation.Nonnull;
//import jakarta.persistence.*;
//
//@Entity
//@Table(name="vote_options")
//public class VoteOption {
//    //Generate ID automatically
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    private String option;
//
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "polls_id", nullable = false)
//    private Poll poll;
//
//    public VoteOption() {}
//
//    public VoteOption(String option) { this.option = option; }
//
//    // Getters & Setters
//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//
//    public String getOption() { return option; }
//    public void setOption(String option) { this.option = option; }
//
//    public Poll getPoll() { return poll; }
//    public void setPoll(Poll poll) { this.poll = poll; }
//}
