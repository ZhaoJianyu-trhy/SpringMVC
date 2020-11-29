package com.zjy.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zjy.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    //局部解决JSON乱码问题
    @RequestMapping(value = "/json1", produces = "application/json;charset=utf-8")
    @ResponseBody//不会走试图解析器，会直接返回字符串
    public String json1() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        User user = new User(1, "小赵", 24);
        String str = mapper.writeValueAsString(user);
        return str;
    }

    //通过配置文件全局解决JSON乱码问题
    @RequestMapping("/json2")
    @ResponseBody//不会走试图解析器，会直接返回字符串
    public String json2() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        User user = new User(1, "小赵", 24);
        String str = mapper.writeValueAsString(user);
        return str;
    }
}
