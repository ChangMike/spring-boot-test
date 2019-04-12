package com.spring.boot.pagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spring.boot.pagehelper.mappers")
public class SpringBootPagehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPagehelperApplication.class, args);
    }

}
