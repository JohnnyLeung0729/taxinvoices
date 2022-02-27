package com.tonechentaxinvoice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestControllerHelloWorld {
    @Value("${user.userName}")
    private String userName;
    @Value("${user.sex}")
    private String sex;
    @Value("${user.age}")
    private String age;

    @GetMapping("/hello")
    public String index(){
        //return "Hello World";
        return "我是"+userName+"，性别："+sex+"，我今年"+age+"岁啦！";
    }
}
