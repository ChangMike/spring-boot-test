package com.spring.boot.pagehelper.controller;

import com.github.pagehelper.PageInfo;
import com.spring.boot.pagehelper.entities.Person;
import com.spring.boot.pagehelper.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PersenController {

    @Resource
    private PersonService personService;

    @GetMapping("queryPerson")
    public Map<String, Object> queryPerson(Integer pageNum, Integer pageSize) {
        List<Person> persons = personService.selectAllForPageHelper(pageNum, pageSize);
        PageInfo<Person> pageInfo = new PageInfo<>(persons);
        Map<String, Object> map = new HashMap<>();
        map.put("pageInfo",pageInfo);
        return map;
    }
}
