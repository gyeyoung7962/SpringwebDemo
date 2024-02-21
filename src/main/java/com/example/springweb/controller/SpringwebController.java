package com.example.springweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringwebController {

    @GetMapping("test")
    public String test(Model model){
        model.addAttribute("data", "hello");
        return  "test";
    }

    @GetMapping("test-mvc")
    public String testMvc(@RequestParam("name") String name, Model model){

        model.addAttribute("name", name);
        return "test-mvc";

    }

    @GetMapping("test-string")
    @ResponseBody
    public String testString(@RequestParam("name") String name){


        return "test"+name;
    }





}
