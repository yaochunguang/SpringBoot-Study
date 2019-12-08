package com.company.springbootmybatis.controller;

import com.company.springbootmybatis.bean.User;
import com.company.springbootmybatis.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 访问测试类
 * @author: chunguang.yao
 * @date: 2019-11-24 23:45
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    //查询所有
    @RequestMapping("/findAll")
    public List<User> findAll() throws JsonProcessingException {
        return userService.findAll();
    }

    //根据id查询
    @RequestMapping("/findById/{id}")
    public User findById(@PathVariable(value = "id") Integer id) {
        return userService.findById(id);
    }

    //新增
    @RequestMapping("/save")
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    //修改
    @RequestMapping("/update")
    public void update(@RequestBody User user) {
        userService.update(user);
    }

    //删除
    @RequestMapping("/delete")
    public void delete(Integer id) {
        userService.delete(id);
    }
}
