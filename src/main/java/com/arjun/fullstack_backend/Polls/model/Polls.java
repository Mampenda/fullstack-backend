//package com.arjun.fullstack_backend.Polls.model;
//
//
//import com.arjun.fullstack_backend.User.model.User;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//import java.time.Instant;
//import java.util.Set;
//
//
//public class Polls extends User {
//
//    @Entity
//    @Table(name="poll")
//    public static class Poll{
//
//        @Id
//        @GeneratedValue
//        private Long id;
//
//        private String question;
//        private Set<VoteOption> options;
//        private User creator;
//        private Instant closesAt;
//
//        public Poll(String question, Set<VoteOption> options, User creator) {
//            this.question = question;
//            this.options = options;
//            this.creator = creator;
//        }
//
//        public String getQuestion() { return question; }
//        public void setQuestion(String question) { this.question = question; }
//
//        public User getCreator() {return creator; }
//        public void setCreator(User creator) { this.creator = creator; }
//
//        public Instant getClosesAt() { return closesAt; }
//        public void setClosesAt(Instant closesAt) { this.closesAt = closesAt;}
//
//        public Set<VoteOption> getOptions() { return options; }
//        public void setOptions(Set<VoteOption> options) { this.options = options; }
//    }
//
//    public static class VoteOption {
//
//        private int order;
//        private String caption;
//
//        public VoteOption(int order, String caption) {
//            this.order = order;
//            this.caption = caption;
//        }
//
//        public VoteOption() { }
//
//        public int getOrder() { return order; }
//        public void setOrder(int order) { this.order = order; }
//
//        public String getCaption() { return caption; }
//        public void setCaption(String caption) { this.caption = caption; }
//    }
//
//}
