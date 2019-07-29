/**
 * @create 2019-07-29 16:27
 * @desc test of user mapper
 **/
package com.american.vector.freeworld.servlet.mapper;

import com.american.vector.freeworld.servlet.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//@Mapper
public interface UserMapper {
    void insert(User user);
    void update(User user);
    User selectUserById(Long id);
    List<User> selectUserByPage(@Param("user")User example,@Param("startIndex") int startIndex,@Param("size")int size);
    void deleteByUserId(Long id);
}

