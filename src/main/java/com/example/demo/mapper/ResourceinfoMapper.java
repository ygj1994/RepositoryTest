package com.example.demo.mapper;

import java.util.List;

import com.example.demo.model.Resourceinfo;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceinfoMapper {
    public List<Resourceinfo> getAll();

    int deleteByPrimaryKey(Integer resId);

    int insert(Resourceinfo record);

    int insertSelective(Resourceinfo record);

    Resourceinfo selectByPrimaryKey(Integer resId);

    int updateByPrimaryKeySelective(Resourceinfo record);

    int updateByPrimaryKey(Resourceinfo record);
}