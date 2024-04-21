package com.walker.learningaboutspringboot1.SimpleAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @RequestMapping("/ping")
    public String pong(){
        return "Pong!!";
    }
}
