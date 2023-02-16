package com.example.demo.jpa.repository;

import com.example.demo.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityJPARepository extends JpaRepository<City, Integer> {
}
