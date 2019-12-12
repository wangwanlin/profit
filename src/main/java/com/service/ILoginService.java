package com.service;

import com.dto.User;
import org.springframework.stereotype.Service;

/**
 * Created by hand on 2017/7/8.
 */
@Service
public interface ILoginService {
    int ifExists(User user);
}
