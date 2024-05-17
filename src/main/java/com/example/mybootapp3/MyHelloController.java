package com.example.mybootapp3;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MyHelloController {
    @RequestMapping("/")
    public String index(){
        return "Hello,Spring Boot!";
    }
    @RequestMapping("/miyagi")
    public String miyagi(){
        return "Miyagi desu!";
    }
    @RequestMapping("/taro")
    public String taro(){
        return "Taro desu!";
    }
}
