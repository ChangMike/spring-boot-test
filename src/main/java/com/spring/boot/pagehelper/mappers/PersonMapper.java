package com.spring.boot.pagehelper.mappers;

import com.spring.boot.pagehelper.entities.Person;
import java.util.List;

public interface PersonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    Person selectByPrimaryKey(Integer id);

    List<Person> selectAll();

    int updateByPrimaryKey(Person record);

    List<Person> selectAllForPageHelper();
}