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
@RequestMapping("/demo")
public class HappinessController {
    @Autowired
    private HappinessService happinessService;

    @RequestMapping("/query")
    public Happiness testQuery(){
        Happiness happiness = happinessService.selectService("北京");
        System.out.println(happiness);
        return happiness;
    }

    @RequestMapping("/insert")
    public Happiness testInsert(){
        happinessService.insertService();
        return happinessService.selectService("西安");
    }
}
