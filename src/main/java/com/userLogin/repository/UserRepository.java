package com.userLogin.repository;

import com.userLogin.model.CustomUser;

public interface UserRepository {
    CustomUser findUserByUsername(String username);
}
