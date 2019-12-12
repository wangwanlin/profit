package com.mapper;

import com.dto.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by hand on 2017/7/8.
 */
@Mapper
public interface EmpMapper {
    List<Emp> selectAll();
    int deleteById(int a);
}
