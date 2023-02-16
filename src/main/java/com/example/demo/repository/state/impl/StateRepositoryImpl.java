package com.example.demo.repository.state.impl;

import com.example.demo.entities.State;
import com.example.demo.jpa.repository.StateJPARepository;
import com.example.demo.repository.state.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public class StateRepositoryImpl implements StateRepository {

    @Autowired
    private StateJPARepository stateJPARepository;

    @Override
    public State findStateById(Integer id) {
        try {
            Optional<State> state = stateJPARepository.findById(id);
            if (state.isPresent()) {
                return state.get();
            }

        } catch (DataAccessException e) {

        }
        return null;
    }
}
