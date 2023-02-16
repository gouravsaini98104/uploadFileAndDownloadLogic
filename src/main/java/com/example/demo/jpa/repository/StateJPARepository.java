package com.example.demo.jpa.repository;

import com.example.demo.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateJPARepository extends JpaRepository<State, Integer> {
}
