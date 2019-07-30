/**
 * @create 2019-07-30 16:18
 * @desc user serivce business
 **/
package com.american.vector.freeworld.servlet.service;

import com.american.vector.freeworld.servlet.pojo.User;
import com.american.vector.freeworld.servlet.pojo.UserJPA;

import java.util.List;

public interface UserService {
    List<UserJPA> findAll();
}

