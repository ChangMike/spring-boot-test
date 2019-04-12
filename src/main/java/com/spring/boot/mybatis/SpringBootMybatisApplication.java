package com.spring.boot.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
// 下面一行不配置也可以
// @ServletComponentScan(value = "aac.pass.daily")
// 扫描mapper接口，必须配置，否则启动时报告找不到mapper接口
@MapperScan("com.spring.boot.mybatis.mappers")
public class SpringBootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisApplication.class, args);
    }

}
