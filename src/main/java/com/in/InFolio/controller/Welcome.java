package com.in.InFolio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @RequestMapping("/")
    public String greetings(){
        return "Hello Nani";
    }
}
