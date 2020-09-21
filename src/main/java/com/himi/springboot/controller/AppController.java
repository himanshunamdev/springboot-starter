package com.himi.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class AppController {

    @GetMapping("greet")
    public String sayHello() {
        return "Hello User!";
    }

}
