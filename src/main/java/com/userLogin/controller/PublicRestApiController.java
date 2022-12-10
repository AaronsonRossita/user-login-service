package com.userLogin.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/public")
public class PublicRestApiController {

    @GetMapping("test1")
    public String test1(){
        return "API Test 1";
    }

    @GetMapping("test2")
    public String test2(){
        return "API Test 2";
    }
}


