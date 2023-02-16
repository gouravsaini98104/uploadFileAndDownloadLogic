package com.example.demo.repository.signup.impl;

import com.example.demo.entities.User;
import com.example.demo.jpa.repository.UserJPARespository;
import com.example.demo.repository.signup.SignUpRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class SignUpRespositoryImpl implements SignUpRespository {

    @Autowired
    private UserJPARespository userRespository;

    @Override
    public void saveUser(User user) {
        try{
            userRespository.save(user);
        } catch (DataAccessException e){
            System.out.println("hello");
        }
    }
}
