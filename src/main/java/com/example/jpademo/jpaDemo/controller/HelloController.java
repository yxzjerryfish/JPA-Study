package com.example.jpademo.jpaDemo.controller;


import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fish
 */
@RestController
public class HelloController {

    @GetMapping("/1")
    public String sayHello() {
        return "Hello Spring!";
    }
}
