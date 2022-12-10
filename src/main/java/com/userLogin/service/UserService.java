package com.userLogin.service;

import com.userLogin.model.CustomUser;
import com.userLogin.model.CustomUserRequest;

public interface UserService {
    void createUser(CustomUserRequest customUser) throws Exception;
    CustomUser findUserByUsername(String username);
}
