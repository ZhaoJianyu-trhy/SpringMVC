package com.zjy.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.zjy.pojo.User;
import com.zjy.utils.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserJsonController {

    @RequestMapping("/j1")
    public String test1() throws JsonProcessingException {
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
//        return userList.toString();
        return new ObjectMapper().writeValueAsString(userList);
    }

    @RequestMapping("/j2")
    public String test2() throws JsonProcessingException {
        Date date = new Date();
        System.out.println(date);
        //返回了时间戳
        return new ObjectMapper().writeValueAsString(date);
    }

    @RequestMapping("/j3")
    public String test3() throws JsonProcessingException {
        Date date = new Date();
        //自定义日期格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return new ObjectMapper().writeValueAsString(dateFormat.format(date));
    }

    @RequestMapping("/j4")
    public String test4() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        //设置不使用时间戳的日起形式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        Date date = new Date();
        return mapper.writeValueAsString(date);
    }

    @RequestMapping("/j5")
    public String test5() throws JsonProcessingException {
        return JsonUtils.getJson(new Date(), "yyyy-MM-dd HH:mm:ss");
    }
}
