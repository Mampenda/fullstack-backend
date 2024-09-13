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

    @Column(name = "vote_option")
    private String voteOption;

    /*Many options to one poll
     * The VoteOption-entity 'owns' the Poll-VoteOption relationship, and it handles the mapping as it is the 'many' in @OneToMany.
     * It will generate an additional field poll_id, to keep track of the poll it belongs to.
     *
     * The @JoinColumn annotation is used to specify the column in the table used for the mapping
     * (done by entity that owns the relationship)
     * */
    @ManyToOne()
    @JoinColumn(name = "poll_id")
    @JsonBackReference
    private Poll poll;

    public VoteOption(String voteOption, Poll poll) {
        this.voteOption = voteOption;
        this.poll = poll;
    }
    public VoteOption() {}

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getVoteOption() { return voteOption; }
    public void setVoteOption(String option) { this.voteOption = option; }

  //  @JsonBackReference
    public Poll getPoll() { return poll; }
    public void setPoll(Poll poll) { this.poll = poll; }
}
