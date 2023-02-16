package com.example.demo.jpa.repository;

import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJPARespository extends JpaRepository<User, Integer> {

}
