package com.company.springbootmybatis.service;


import com.company.springbootmybatis.bean.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Integer id);

    void save(User user);

    void update(User user);

    void delete(Integer id);
}
