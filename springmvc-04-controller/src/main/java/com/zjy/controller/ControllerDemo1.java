package com.zjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerDemo1 {

    @RequestMapping("/hello")
    public String test1(Model model) {
        model.addAttribute("msg", "hello");
        return "hello";
    }
}
