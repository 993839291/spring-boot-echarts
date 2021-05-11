package com.demo.mapper;

import com.demo.model.Index;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface IndexMapper {

    List<Index> findAll();

    @Select("select d2%2+1 from test ORDER BY type ASC")
    List<Integer> getList();
}
