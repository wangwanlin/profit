package com; /**
 * Created by hand on 2017/6/19.
 */

/**
 * @author: wanlin.wang
 * Date: 2017/6/19 18:21
 * Description:
 */

import com.lll.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan
public class Example {
//    @Autowired
//    private TestMapper mapper;
//
//    @RequestMapping("/bat")
//    public String hello(){
//        return mapper.simpleSelect(1L);
//    }
    public static void main(String[] args) throws Exception {
//        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(Example.class, args);
    }

}