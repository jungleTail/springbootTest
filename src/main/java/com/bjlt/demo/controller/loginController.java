package com.bjlt.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class loginController
{
    @Value("${server.port}")
    String port;

    @RequestMapping("login")
    public String Login(@RequestParam String username){

        if(username != "")
            return "hello <br>"+username+"<br> from <br>"+port;
        else{
            return "please input your username and password";
        }
    }
}
