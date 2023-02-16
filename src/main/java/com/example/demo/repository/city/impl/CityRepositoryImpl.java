package com.example.demo.repository.city.impl;

import com.example.demo.entities.City;
import com.example.demo.jpa.repository.CityJPARepository;
import com.example.demo.repository.city.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CityRepositoryImpl implements CityRepository {

    @Autowired
    private CityJPARepository cityJPARepository;
    @Override
    public City findCityById(Integer id) {

        try{
            Optional<City> city = cityJPARepository.findById(id);
            if(city.isPresent()){
                return city.get();
            }

        } catch (DataAccessException e){

        }
        return null;
    }
}
