package com.aaa.demo.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aopController {

    @RequestMapping("/aaa")
    public String saySomething() {
        return "实现一下aop";
    }
}
