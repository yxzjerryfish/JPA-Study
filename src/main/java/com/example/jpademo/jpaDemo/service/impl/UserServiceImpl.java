package com.example.jpademo.jpaDemo.service.impl;

import com.example.jpademo.jpaDemo.dto.User;
import com.example.jpademo.jpaDemo.repository.UserRepository;
import com.example.jpademo.jpaDemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

/**
 * @author Fish
 * @create 2022/4/24 9:18
 */
@Component
@RequiredArgsConstructor
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
}
