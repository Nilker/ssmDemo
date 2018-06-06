package com.springmybatis.demo.service;



import com.springmybatis.demo.entity.User;

import java.util.List;


public interface UserService extends IBaseService<User> {
    List<User> getUsers(Integer userId);
}
