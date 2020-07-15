package com.hubt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hubt.mapper.UserMapper;
import com.hubt.model.User;
import com.hubt.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    /**
     * 注入UserMapper接口
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * 新增用户
     */
    @Override
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }

    /**
     * 更新用户
     */
    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }

    /**
     * 根据Id删除用户
     */
    @Override
    public boolean deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    /**
     * 根据id查找用户
     */
    @Override
    public User findUserById(int id) {
        User user = userMapper.findUserById(id);
        return user;
    }

    /**
     * 查询所有用户
     */
    @Override
    public List<User> findAll() {
        List<User> allUser = userMapper.findAll();
        return allUser;
    }
}
