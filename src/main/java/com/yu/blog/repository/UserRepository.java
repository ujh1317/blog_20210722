package com.yu.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yu.blog.model.User;

//DAO
public interface UserRepository extends JpaRepository<User, Integer> {

}
