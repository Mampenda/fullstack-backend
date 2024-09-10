package com.arjun.fullstack_backend.Polls.exception;

public class PollNotFoundException extends RuntimeException {
    public PollNotFoundException(Long id) {
        super("Poll with id " + id + " not found");
    }
}
