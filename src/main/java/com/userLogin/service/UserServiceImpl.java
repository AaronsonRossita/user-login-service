package com.userLogin.service;

import com.userLogin.model.CustomUser;
import com.userLogin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public CustomUser findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }
}
