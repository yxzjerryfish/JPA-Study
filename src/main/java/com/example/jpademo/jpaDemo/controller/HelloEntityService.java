package com.example.jpademo.jpaDemo.controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Fish
 */
@Service
public class HelloEntityService {
    @Autowired
    EntityManager entityManager;

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public void print(){
        System.out.println(Thread.currentThread().getName() + entityManager.toString());
    }

    public void clear(){
        entityManager.clear();
    }
}
