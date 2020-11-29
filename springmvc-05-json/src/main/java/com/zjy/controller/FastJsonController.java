package com.zjy.controller;

import com.alibaba.fastjson.JSON;
import com.zjy.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FastJsonController {

    @RequestMapping("/fj1")
    public String test1() {

        final User user = new User(1, "小赵", 24);
        final User user1 = new User(1, "小张", 24);
        final User user2 = new User(1, "小傅", 24);
        final User user3 = new User(1, "小任", 24);
        final User user4 = new User(1, "小双", 24);
        List<User> userList = new ArrayList<User>() {{
            add(user);
            add(user1);
            add(user2);
            add(user3);
            add(user4);
        }};
        return JSON.toJSONString(userList);
    }
}
