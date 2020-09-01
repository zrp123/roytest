package com.roy.roytest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "/apo/doit")
    public String doit(){
        //测试的一个项目，测试
        return "doit_ok";
    }

}
