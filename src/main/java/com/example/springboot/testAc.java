package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testAc {

    @GetMapping("/index")
    public String test(){
        System.out.println("======");
        return "index";
    }
}
