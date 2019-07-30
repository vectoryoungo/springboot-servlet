package com.american.vector.freeworld.servlet;

import com.american.vector.freeworld.servlet.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=ServletApplication.class)
public class ServletApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testFindAll(){
		System.out.println(this.userService.findAll());

		System.out.println("=========================");

		System.out.println(this.userService.findAll());
	}


}
