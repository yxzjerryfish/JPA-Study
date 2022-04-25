package com.example.jpademo.jpaDemo.service;

import org.springframework.stereotype.Service;

/**
 * @author Fish
 * @created 2022/4/24 9:14
 */
@Service
public interface UserService {

    /**
     * 创建默认用户
     */
    void initMainUser();

    /**
     * 打印全部User
     */
    void printAllUser();
}
