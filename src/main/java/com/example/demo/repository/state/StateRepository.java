package com.example.demo.repository.state;

import com.example.demo.entities.State;

public interface StateRepository {

    State findStateById(Integer id);
}
