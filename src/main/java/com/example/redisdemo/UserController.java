package com.example.redisdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/6/22 14:49
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService happinessService;

    @RequestMapping("/query")
    public User testQuery(){
        User happiness = happinessService.selectService("王五");
        System.out.println(happiness);
        return happiness;
    }

}
