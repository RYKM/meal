package com.bisher.meal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 */
@RestController
public class HelloController {

    @RequestMapping("/index")
    public String hello(){
        System.out.println("111111");
        return "index";

    }

    @RequestMapping("/login")
    public String login(){
        System.out.println("2222222");
        return "login";

    }
}
