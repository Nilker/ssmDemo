package com.springmybatis.demo.service.impl;

import com.springmybatis.demo.dao.mapper.UserMapper;
import com.springmybatis.demo.entity.User;

import com.springmybatis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers(Integer userId) {
          return   userMapper.selectAll();
    }
}