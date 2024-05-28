package com.example.mybootapp3;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyHelloController {
        @RequestMapping("/")
        public String index(Model model) {
        //return "this is Spring Boot sample.";
        return "index";
    }
}
