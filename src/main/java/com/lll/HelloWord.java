package com.lll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by qq741 on 2017/3/28.
 */
@Controller
public class HelloWord {
//    @Autowired
//    private TestMapper testMapper;
    @RequestMapping("/index")
    public String hello(Map<String,Object> map){
        String name = "123";//testMapper.simpleSelect(1L);
        map.put("name", name);
        return "index";
    }
}
