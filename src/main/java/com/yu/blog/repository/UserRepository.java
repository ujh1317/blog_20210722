package com.yu.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yu.blog.model.User;

//DAO
public interface UserRepository extends JpaRepository<User, Integer> {
	// SELECT * FROM user WHERE username = 1?;
	Optional<User> findByUsername(String username);
}
