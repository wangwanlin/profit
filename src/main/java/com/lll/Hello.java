package com.lll;/**
 * Created by hand on 2017/6/23.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: wanlin.wang
 * Date: 2017/6/23 10:29
 * Description:
 */
@RestController
public class Hello
{
    @Autowired
    TestMapper mapper;
    @RequestMapping("/hello")
    @ResponseBody
        public String hello(@RequestHeader("Accept-Encoding") String encoding,@RequestBody String body){
        System.out.println(encoding);
        System.out.println(body);
        return mapper.simpleSelect(1L) + " is 22";
    }
}
