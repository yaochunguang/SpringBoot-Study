package com.company.springbootmybatis.mapper;

import com.company.springbootmybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description: user表Mapper
 * @author: chunguang.yao
 * @date: 2019-11-24 23:34
 */
@Mapper//表明当前接口是一个Mapper，被Mybatis框架扫描
public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 通过id查找用户
     * @param id
     * @return
     */
    User findUserById(Integer id);

    /**
     * 新增用户
     * @param user
     */
    void save(User user);

    /**
     * 修改用户
     * @param user
     */
    void update(User user);

    /**
     * 删除用户
     * @param id
     */
    void delete(Integer id);

}
