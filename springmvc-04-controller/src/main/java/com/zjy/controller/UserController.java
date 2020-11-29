package com.zjy.controller;

import com.zjy.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    //localhost:8080/user/test1?username=xxx
    @RequestMapping("/test1")
    public String test1(@RequestParam("username") String name, Model model) {
        //接受前端参数
        System.out.println("接受的前端参数：" + name);
        //将返回的结果传递给前端
        model.addAttribute("msg", name);
        //跳转试图
        return "test1";
    }

    /**
     * 从前端接受一个对象，可以自动封装对象
     * 可以测试一下构建对象是不是通过构造函数进行的
     * @param user
     * @return
     */
    @RequestMapping("/test2")
    public String test2(User user) {
        System.out.println(user);
        return "test2";
    }
}
