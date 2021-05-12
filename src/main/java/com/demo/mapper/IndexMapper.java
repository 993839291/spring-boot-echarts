package com.demo.mapper;

import com.demo.model.Index;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface IndexMapper {

    List<Index> findAll();

    @Select("select d2 from test_back_up ORDER BY type ASC")
    List<Integer> getList();

    @Select("INSERT INTO `fapiao`.`test` (`d1`, `d2`) VALUES (#{id}, #{id});")
    Integer inster(Integer id);

    @Delete(" delete from `fapiao`.`test` ;")
    Integer delete(Integer id);
}
