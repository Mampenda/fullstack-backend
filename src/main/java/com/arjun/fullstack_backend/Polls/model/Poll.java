package com.arjun.fullstack_backend.Polls.model;

import com.arjun.fullstack_backend.User.model.User;
import com.arjun.fullstack_backend.VoteOptions.model.VoteOption;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="polls")
public class Poll {
    //Generate ID automatically
    @Id
    @GeneratedValue
    private Long id;

    /*Many posts to one user
     * The Poll-entity 'owns' the User-Poll relationship, and it handles the mapping as it is the 'many' in @OneToMany.
     * It will generate an additional field creator_id, to keep track of the user which created the poll.
     *
     * The @JoinColumn annotation is used to specify the column in the table used for the mapping
     * (done by entity that owns the relationship)
     * */
    @ManyToOne
    @JoinColumn(name = "creator_id")
    private User creator;

    // One poll to many options
    @OneToMany(mappedBy = "poll")
    private List<VoteOption> voteOptions;

    private String question;

    //Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getQuestion() { return question; }
    public void setQuestion(String name) { this.question = question; }

    public User getCreator() { return creator; }
    public void setCreator(User creator) { this.creator = creator; }

    public List<VoteOption> getVoteOptions() { return voteOptions; }
    public void setVoteOptions(List<VoteOption> voteOptions) { this.voteOptions = voteOptions; }

//    private static class customPair<I extend Number, VoteOption> {
//        private int index;
//        private VoteOption option;
//        public customPair(Integer index, VoteOption option) {
//            this.index = index;
//            this.option = option;
//        }
//
//        public int getIndex() { return index; }
//        public void setIndex(int index) { this.index = index; }
//        public VoteOption getOption() { return option; }
//        public void setOption(VoteOption option) { this.option = option; }
//    }
}

