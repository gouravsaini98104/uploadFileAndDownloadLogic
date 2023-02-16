package com.example.demo.jpa.repository;

import com.example.demo.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryJPARepository extends JpaRepository<Country, Integer> {
}
