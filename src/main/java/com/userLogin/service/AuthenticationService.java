package com.userLogin.service;

import com.userLogin.security.model.AuthenticationRequest;

public interface AuthenticationService {
    String createAuthenticationToken(AuthenticationRequest authenticationRequest) throws Exception;
}
