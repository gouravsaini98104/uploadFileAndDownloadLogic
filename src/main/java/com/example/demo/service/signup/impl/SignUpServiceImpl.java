package com.example.demo.service.signup.impl;

import com.example.demo.mappers.UserMapper;
import com.example.demo.models.User;
import com.example.demo.repository.signup.SignUpRespository;
import com.example.demo.service.signup.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private SignUpRespository signUpRespository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void createUser(User user) {

        signUpRespository.saveUser(userMapper.mapUserModeltoEntity(user));

    }
}
