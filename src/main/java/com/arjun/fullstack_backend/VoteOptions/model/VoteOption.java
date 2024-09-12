package com.arjun.fullstack_backend.VoteOptions.model;

import com.arjun.fullstack_backend.Polls.model.Poll;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name="vote_options")
public class VoteOption {
    //Generate ID automatically
    @Id
    @GeneratedValue
    private Long id;

    private String option;

    /*Many options to one poll
     * The VoteOption-entity 'owns' the Poll-VoteOption relationship, and it handles the mapping as it is the 'many' in @OneToMany.
     * It will generate an additional field poll_id, to keep track of the poll it belongs to.
     *
     * The @JoinColumn annotation is used to specify the column in the table used for the mapping
     * (done by entity that owns the relationship)
     * */
    @ManyToOne()
    @JoinColumn(name = "poll_id")
    private Poll poll;

    public VoteOption(String option, Poll poll) {
        this.option = option;
        this.poll = poll;
    }
    public VoteOption() {}

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getOption() { return option; }
    public void setOption(String option) { this.option = option; }

    @JsonBackReference
    public Poll getPoll() { return poll; }
    public void setPoll(Poll poll) { this.poll = poll; }
}
