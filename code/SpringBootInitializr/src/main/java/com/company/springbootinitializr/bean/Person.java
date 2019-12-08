package com.company.springbootinitializr.bean;

import org.springframework.stereotype.Component;

/**
 * @description: 通过@Value方式注入属性
 * @author: chunguang.yao
 * @date: 2019-11-24 23:04
 */
@Component
public class Person {

    private String name;

    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
