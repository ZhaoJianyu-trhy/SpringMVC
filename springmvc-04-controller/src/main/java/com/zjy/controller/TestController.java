package com.zjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/text")
public class TestController {

    /**
     * 使用过滤器解决乱码问题
     * @param name
     * @param model
     * @return
     */
    @PostMapping("/t1")
    public String testText(@RequestParam("a") String name, Model model) {
        System.out.println("name = " + name);
        model.addAttribute("msg", name);
        return "hello";
    }
}
