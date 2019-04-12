package com.spring.boot.mybatis.controller;

import com.spring.boot.mybatis.entities.Person;
import com.spring.boot.mybatis.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PersonController {

    @Resource
    private PersonService personService;

    // 访问路径：http://127.0.0.1/queryPerson?id=2
    @GetMapping("queryPerson")
    public Person queryPerson(Integer id) {
        return personService.selectByPrimaryKey(id);
    }
}
