package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * @Author: Joseph Xu
 * @Date: 2020/11/21 21:30
 */
public interface IUserDao {

    /**
     *
     */
    List<User> findAll();
}
