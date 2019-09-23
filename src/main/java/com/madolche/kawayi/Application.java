package com.madolche.kawayi;


import com.madolche.kawayi.service.serviceImpl.UserServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.madolche.kawayi.mapper")
public class Application {
    @Autowired
    private static UserServiceImpl userServiceImpl;

    public static void main(String[] args) {
        int int1 = userServiceImpl.addUser();
        SpringApplication.run(Application.class, args);
    }

    public void run(String... args) throws Exception {

    }
}
