package com.spring.boot.mybatis.service;

import com.spring.boot.mybatis.entities.Person;
import com.spring.boot.mybatis.mappers.PersonMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonService {

    @Resource
    private PersonMapper personMapper;

    public Person selectByPrimaryKey(Integer id) {
        return personMapper.selectByPrimaryKey(id);
    }
}
