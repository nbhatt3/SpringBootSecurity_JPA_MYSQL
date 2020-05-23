package com.nitinbhatt.springsecurityjpa;

import com.nitinbhatt.springsecurityjpa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Asking JPA to create implementation of method findByUserName
// which need to check/find in User entity in order to find the given userName
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
