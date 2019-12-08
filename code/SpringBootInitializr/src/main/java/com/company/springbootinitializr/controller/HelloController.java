package com.company.springbootinitializr.controller;

import com.company.springbootinitializr.bean.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: chunguang.yao
 * @date: 2019-11-24 22:04
 */
@RestController
public class HelloController {

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private Integer age;

    @RequestMapping("/hello")
    public String hello() {
        return "SpringBootInitializr Hello World!!!" + name + age;
    }
}
