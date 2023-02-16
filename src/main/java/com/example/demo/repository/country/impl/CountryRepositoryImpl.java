package com.example.demo.repository.country.impl;

import com.example.demo.entities.Country;
import com.example.demo.jpa.repository.CountryJPARepository;
import com.example.demo.repository.country.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CountryRepositoryImpl implements CountryRepository {

    @Autowired
    private CountryJPARepository countryJPARepository;

    @Override
    public Country findCountryById(Integer id) {
        try {
            Optional<Country> country = countryJPARepository.findById(id);
            if (country.isPresent()) {
                return country.get();
            }

        } catch (DataAccessException e) {

        }

        return null;
    }
}
