package com.american.vector.freeworld.servlet;

import com.american.vector.freeworld.servlet.pojo.UserJPA;
import com.american.vector.freeworld.servlet.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=ServletApplication.class)
public class ServletApplicationTests {

	@Autowired
	private UserService userService;
	@Autowired
	private RedisTemplate<String,Object> redisTemplate;
	@Test
	public void contextLoads() {
	}

	@Test
	public void testFindAll(){
		System.out.println(this.userService.findAll());

		System.out.println("=========================");

		System.out.println(this.userService.findAll());
	}

	@Test
	public void setCache() {
		List<UserJPA> userJPAList = this.userService.findAll();
		redisTemplate.opsForValue().set("users",userJPAList);
	}

	@Test
	public void getCache() {
		System.out.println("$$$$$$$$$$" + redisTemplate.opsForValue().get("users"));

	}


}
