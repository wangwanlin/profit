package com.service.impl;

import com.dto.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hand on 2017/7/8.
 */
@Service
public interface IEmpService {
    List<Emp> selectAll();
    int deleteById(int a);
}
