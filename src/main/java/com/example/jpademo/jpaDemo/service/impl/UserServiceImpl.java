package com.example.jpademo.jpaDemo.service.impl;

import com.example.jpademo.jpaDemo.dto.User;
import com.example.jpademo.jpaDemo.repository.UserRepository;
import com.example.jpademo.jpaDemo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

/**
 * @author Fish
 * @create 2022/4/24 9:18
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void initMainUser() {
        if (CollectionUtils.isEmpty(userRepository.findAll())){
            userRepository.save(User
                    .builder()
                    .name("fish")
                    .email("a@a.com")
                    .build());
        }
    }

    public void printAllUser() {
        userRepository.findAll().forEach(
                user -> log.info(user.toString())
        );
    }
}
