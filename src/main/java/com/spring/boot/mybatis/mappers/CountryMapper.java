package com.spring.boot.mybatis.mappers;

import com.spring.boot.mybatis.entities.Country;
import java.util.List;

public interface CountryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Country record);

    Country selectByPrimaryKey(Integer id);

    List<Country> selectAll();

    int updateByPrimaryKey(Country record);
}