package com.expressmealsapp.expressmeals.repository;

import com.expressmealsapp.expressmeals.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByUsername(String username);
}
