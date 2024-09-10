package com.arjun.fullstack_backend.User.repository;

import com.arjun.fullstack_backend.User.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
