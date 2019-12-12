package com.mapper;

import com.dto.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by hand on 2017/7/8.
 */
@Mapper
public interface UserMapper {
    int ifExists(User user);
}
