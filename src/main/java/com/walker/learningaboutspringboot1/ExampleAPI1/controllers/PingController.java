package com.walker.learningaboutspringboot1.ExampleAPI1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @RequestMapping("/ping")
    public String pong(){
        return "Pong!!";
    }
}
