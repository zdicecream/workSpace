package com.example.mypro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class indexController {


    @RequestMapping("/")
    public ModelAndView indext(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        //modelAndView.addObject("userList", userService.selectList(null));
        return modelAndView;
    }
    @RequestMapping("/show")
    public ModelAndView show(ModelAndView modelAndView) {
        modelAndView.setViewName("show");
        return modelAndView;
    }
}

