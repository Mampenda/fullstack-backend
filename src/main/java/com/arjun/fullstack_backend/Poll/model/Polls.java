package com.arjun.fullstack_backend.Poll.model;

import com.arjun.fullstack_backend.User.model.User;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;
import java.util.Set;


@Entity
public class Polls {

    //Generate ID automatically
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //The user that created the poll
    public static class Creator extends User {

        private Long id;

        //User fields
        private String name;
        private String username;
        private String email;
        private String password;
        private List<Poll> createdPolls;

        public Creator() {}

        public Creator(Long id, String name, String username, String email, String password) {
            this.id = id;
            this.name = name;
            this.username = username;
            this.email = email;
            this.password = password;
//            this.createdPolls = new List<Poll>();
        }

        // Getters and Setters
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }

        public List<Poll> getCreatedPolls() { return createdPolls; }
        public void setCreatedPolls(List<Poll> createdPolls) { this.createdPolls = createdPolls; }
    }

    public static class Poll {

        private String question;
        private Set<VoteOption>  options;
        private Creator creator;
        private Instant closesAt;

        public Poll(String question, Set<VoteOption> options, Creator creator){
            this.question = question;
            this.options = options;
            this.creator = creator;
        }

        //Getters and Setters
        public String getQuestion() { return question; }
        public void setQuestion(String question) { this.question = question; }

        public Set<VoteOption> getOptions() { return options; }
        public void setOptions(Set<VoteOption> options) {this.options = options;}

        public Creator getCreator() { return creator;}
        public void setCreator(Creator creator) { this.creator = creator; }

        public Instant getClosesAt() { return closesAt; }
        public void setClosesAt(Instant closesAt) {this.closesAt = closesAt; }
    }

    public static class VoteOption {
        private int order;
        private String caption;

        public VoteOption(int order, String caption) {
            this.order = order;
            this.caption = caption;
        }

        public VoteOption() {}

        //Getters and Setters
        public int getOrder() { return order; }
        public void setOrder(int order) { this.order = order; }
        public String getCaption() { return caption; }
        public void setCaption(String caption) { this.caption = caption; }
    }

}

