package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sn
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/homepage")
    @ResponseBody
    public String homePage(){
        return "home page";
    }
}
