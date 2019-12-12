package com.service.impl;/**
 * Created by hand on 2017/7/8.
 */

import com.dto.Emp;
import com.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wanlin.wang
 * Date: 2017/7/8 12:01
 * Description:
 */
@Service
public class EmpServiceImpl implements IEmpService {
    @Autowired
    private EmpMapper mapper;

    @Override
    public int deleteById(int a) {
       return  mapper.deleteById(a);
    }

    @Override
    public List<Emp> selectAll() {
        return mapper.selectAll();
    }
}
