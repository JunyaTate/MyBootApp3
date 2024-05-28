package com.example.mybootapp5;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyHelloController {
        @RequestMapping(value = "/post",method = RequestMethod.POST)
        /*public String index(Model model) {
        //return "this is Spring Boot sample.";
        model.addAttribute("msg", "this is setting message");
        return "index";
        }
        */
        public ModelAndView postForm(@RequestParam("text1")String text1){
            ModelAndView mv = new ModelAndView("index");
            mv.addObject("msg", "you write '" + text1 + "'!!!");
            return mv;
        }
    }
