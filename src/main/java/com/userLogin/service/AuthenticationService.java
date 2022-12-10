package com.userLogin.service;

import com.userLogin.security.model.AuthenticationRequest;
import com.userLogin.security.model.AuthenticationResponse;

public interface AuthenticationService {
    AuthenticationResponse createAuthenticationToken(AuthenticationRequest authenticationRequest) throws Exception;
}
