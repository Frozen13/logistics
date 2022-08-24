package com.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* 主页控制器 */
@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String index(){
        return "/login.html";
    }

    @RequestMapping(value = "/tologin")
    public String login(){
        return "/login.html";
    }
}
