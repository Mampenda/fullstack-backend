package com.arjun.fullstack_backend.VoteOptions.exception;

public class VoteOptionNotFoundException extends RuntimeException {
    public VoteOptionNotFoundException(Long id) { super("VoteOption with id " + id + " not found"); }
}
