package com.springmybatis.demo.service.impl;

import com.springmybatis.demo.dao.mapper.UserMapper;
import com.springmybatis.demo.entity.User;
import com.springmybatis.demo.entity.UserExample;

import com.springmybatis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers(Integer userId) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if (!"".equals(userId == null ? "" : userId)) {
            criteria.andUidEqualTo(userId);
        }
        return userMapper.selectByExample(example);

    }
}