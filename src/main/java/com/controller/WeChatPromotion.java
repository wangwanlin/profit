package com.controller;

import com.dto.Emp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class WeChatPromotion {
    @RequestMapping("/weChatPromotion")
    public ModelAndView weChatPromotion(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("weChatPromotion");
        return mv;
    }
}
