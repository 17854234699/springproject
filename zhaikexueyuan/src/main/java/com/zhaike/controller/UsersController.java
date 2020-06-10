package com.zhaike.controller;

import com.zhaike.entity.Users;
import com.zhaike.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UsersController {

   @Autowired
   private   UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/login")
    public ModelAndView method(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        mav.addObject("nums",100);
        return mav;
    }


    @RequestMapping("/all")
    @ResponseBody
    public List<Users> getAll(){
        return userService.getAllUsers();
    }
}
