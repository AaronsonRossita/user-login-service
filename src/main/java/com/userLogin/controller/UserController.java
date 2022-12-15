package com.userLogin.controller;

import com.userLogin.model.CustomUserRequest;
import com.userLogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/public/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    @CrossOrigin
    public ResponseEntity<?> createUser(@RequestBody CustomUserRequest customUser){
        try{
           userService.createUser(customUser);
           return null;
        } catch (Exception exception){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
        }
    }
}



