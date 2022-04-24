package com.example.jpademo.jpaDemo.controller;


import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fish
 */
@RestController
public class HelloController {

    @Autowired
    EntityManager entityManager;

    @GetMapping("/1")
    @Transactional(rollbackFor = Exception.class)
    public String sayHello() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + entityManager.toString());
        Thread.sleep(60*1000L);
        return "Hello Spring!";
    }
}
