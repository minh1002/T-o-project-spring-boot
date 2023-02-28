package edu.poly.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/demo")
    @ResponseBody
    public String demo(){
        return "demo";
    }
}
