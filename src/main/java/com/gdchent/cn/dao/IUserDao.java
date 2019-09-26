package com.gdchent.cn.dao;

import com.gdchent.cn.domain.User;

import java.util.List;

/**
 * 用户的持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有操作
     */
    List<User> findAll();
}
