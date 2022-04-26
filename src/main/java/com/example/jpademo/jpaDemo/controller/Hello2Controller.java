package com.example.jpademo.jpaDemo.controller;

import com.example.jpademo.jpaDemo.service.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fish
 */
@RestController
public class Hello2Controller {

    @Autowired
    private HelloEntityService entityService;

    @Autowired
    UserService userService;

    @GetMapping("/2")
    @Transactional(rollbackFor = Exception.class)
    public String sayHello() throws InterruptedException {
        return "Hello Spring!";
    }

    @GetMapping("/3")
    @Transactional(rollbackFor = Exception.class)
    public String sayHello3() throws InterruptedException {
        Runnable runnable1 = helloRunnable();
        entityService.print();
        entityService.clear();

        return "Hello Spring!";
    }

    public Runnable helloRunnable(){
        return ()->{
            System.out.println(entityService.toString());
            entityService.print();
        };
    }
}
