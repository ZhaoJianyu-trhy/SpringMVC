package com.zjy.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView view = new ModelAndView();

        //业务代码
        String res = "HelloSpringMVC";
        view.addObject("msg", res);

        //视图跳转
        view.setViewName("test");
        return view;
    }
}
