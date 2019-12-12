package com.service.impl;/**
 * Created by hand on 2017/7/8.
 */

import com.dto.User;
import com.mapper.UserMapper;
import com.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: wanlin.wang
 * Date: 2017/7/8 11:20
 * Description:
 */
@Service
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private UserMapper mapper;
    @Override
    public int ifExists(User user) {
        return mapper.ifExists(user);
    }
}
