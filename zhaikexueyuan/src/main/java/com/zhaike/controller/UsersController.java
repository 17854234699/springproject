package com.zhaike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
