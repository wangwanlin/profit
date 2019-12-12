package com.controller;/**
 * Created by hand on 2017/7/8.
 */

import com.dto.Emp;
import com.service.impl.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author: wanlin.wang
 * Date: 2017/7/8 12:03
 * Description:
 */
@RestController
public class EmpController {
    @Autowired
    private IEmpService service;
    @RequestMapping("/emplist")
    public List<Emp> empList(){

        List<Emp> empList = service.selectAll();
        Emp emp = new Emp();
        emp.setName("SERVER 1");
        empList.add(emp);

        return empList;
    }
    @RequestMapping("/deleteEmp")
    public String delete(@RequestParam int  id){
         int a = service.deleteById(id);
         if(a==1){
             return "delete success responsed by server 1";
         }else{
             return "no such person responsed by server 1";
         }
    }

    @RequestMapping("/emplistHtml")
    public ModelAndView empListHtml(){
        ModelAndView mv = new ModelAndView();
        List<Emp> empList = service.selectAll();
        mv.getModel().put("list",empList);
        mv.setViewName("emp");
        return mv;
    }
    @RequestMapping("deleteEmpHtml")
    public ModelAndView deleteHtml(@RequestParam int  id){
        ModelAndView mv = new ModelAndView();
        service.deleteById(id);
        List<Emp> empList = service.selectAll();
        mv.getModel().put("list",empList);
        mv.setViewName("emp");
        return mv;
    }



}
