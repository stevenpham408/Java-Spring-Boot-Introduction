package com.helloworlddemo.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Handler methods that routes the localhost:8080 server
@RequestMapping("/home")
public class AppConfiguration {

    @RequestMapping("/")
    public String home(){
        return "Default";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
