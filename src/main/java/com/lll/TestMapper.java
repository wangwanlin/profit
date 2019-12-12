package com.lll;

import org.apache.ibatis.annotations.Mapper;

/**
 * Created by wanlin.wang
 */
@Mapper
public interface TestMapper {
    String simpleSelect(Long id);
}
