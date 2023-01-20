package com.expressmealsapp.expressmeals.repository;

import com.expressmealsapp.expressmeals.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
