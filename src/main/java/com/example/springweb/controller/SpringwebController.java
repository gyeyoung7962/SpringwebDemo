package com.example.springweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringwebController {

    @GetMapping("test")
    public String test(Model model){
        model.addAttribute("data", "hello");
        return  "test";
    }
}
