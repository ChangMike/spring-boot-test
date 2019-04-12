package com.spring.boot.pagehelper.service;

import com.github.pagehelper.PageHelper;
import com.spring.boot.pagehelper.entities.Person;
import com.spring.boot.pagehelper.mappers.PersonMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PersonService {

    @Resource
    private PersonMapper personMapper;

    public List<Person> selectAllForPageHelper(Integer pageNum, Integer pageSize) {
        if (pageNum != null && pageSize != null)
            PageHelper.startPage(pageNum, pageSize);
        return personMapper.selectAll();
    }
}
