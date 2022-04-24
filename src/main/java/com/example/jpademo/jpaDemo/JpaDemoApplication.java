package com.example.jpademo.jpaDemo;

import com.example.jpademo.jpaDemo.service.InitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Fish
 */
@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	@Autowired
	InitService initService;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		initService.initUserService();
	}
}
