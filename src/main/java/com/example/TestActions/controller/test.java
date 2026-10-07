package com.example.TestActions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("getMessage")
    public String getMessage(){
        return  "Successfully deployed";
    }


}
