/**
 * @create 2019-07-30 16:36
 * @desc UserDao
 **/
package com.american.vector.freeworld.servlet.mapper;

import com.american.vector.freeworld.servlet.pojo.UserJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserDao extends JpaRepository<UserJPA, Long>, JpaSpecificationExecutor<UserJPA> {
}

