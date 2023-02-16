package com.example.demo.repository.country;

import com.example.demo.entities.Country;

public interface CountryRepository {

    Country findCountryById(Integer id);
}
