package com.userLogin.service;

import com.userLogin.model.CustomUser;

public interface UserService {
    CustomUser findUserByUsername(String username);
}
