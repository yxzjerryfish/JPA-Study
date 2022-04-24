package com.example.jpademo.jpaDemo.repository;

import com.example.jpademo.jpaDemo.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Fish
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
