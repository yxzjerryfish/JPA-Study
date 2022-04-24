package com.example.jpademo.jpaDemo.service.impl;

import com.example.jpademo.jpaDemo.service.InitService;
import com.example.jpademo.jpaDemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Fish
 * @create 2022/4/24 9:24
 */
@Service
@RequiredArgsConstructor
public class InitServiceImpl implements InitService {

    final UserService userService;

    @Override
    public void initUserService() {
        userService.initMainUser();
    }
}
