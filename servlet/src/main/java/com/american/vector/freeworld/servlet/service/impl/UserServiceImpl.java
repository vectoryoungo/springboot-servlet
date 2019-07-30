/**
 * @create 2019-07-30 16:20
 * @desc implementation of UserService
 **/
package com.american.vector.freeworld.servlet.service.impl;

import com.american.vector.freeworld.servlet.mapper.UserDao;
import com.american.vector.freeworld.servlet.mapper.UserMapper;
import com.american.vector.freeworld.servlet.pojo.User;
import com.american.vector.freeworld.servlet.pojo.UserJPA;
import com.american.vector.freeworld.servlet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Cacheable(value = "vectorCache",key = "'conditionUser'")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Cacheable(value = "vectorCache",key = "'conditionUser'")
    public List<UserJPA> findAll() {
        return userDao.findAll();
    }
}

