package com.example.configclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping("/test")
    public String apiTest() {
        return "test입니다.";
    }

}
