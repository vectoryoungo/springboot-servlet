package com.american.vector.freeworld.servlet.controller;

import com.american.vector.freeworld.servlet.mapper.UserMapper;
import com.american.vector.freeworld.servlet.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {

	@Autowired
	private UserMapper userDao;
	
	/**
	 * 页面跳转方法，进入新增用户页面。
	 * 请求没有任何的参数，为什么需要定义参数表User？
	 * 因为新增用户页面中，使用了th:errors来显示错误提示内容。就必须在作用域中有一个命名为user.name的attribute。
	 * 在任何的作用域中，必须有一个对象命名为user，且内部有属性命名为name；或任何的作用域中有一个命名为user.name的attribute。
	 * @param user
	 * @return
	 */
	@RequestMapping("/toSavePage")
	public String toSavePage(User user){
		
		return "saveUser";
	}
	
	@RequestMapping("/saveUser")
	public String save(@Valid User user, BindingResult result){
		if(result.hasErrors()){
			return "saveUser";
		}
		
		this.userDao.insert(user);
		
		return "index";
	}
	
	@RequestMapping("/toQueryPage")
	public String toQueryPage(){
		
		return "queryUser";
	}
	
	@RequestMapping("/queryUser")
	public String queryUser(String name, @RequestParam(value="age", defaultValue="0")Integer age, @RequestParam(value="page", defaultValue="1")int page, @RequestParam(value="size", defaultValue="3")int size, Model model){
		User example = new User();
		if(null != name && !"".equals(name)){
			example.setName(name);
		}
		example.setAge(age);
		
		List<User> users = this.userDao.selectUserByPage(example, (page-1)*size, size);
		
		model.addAttribute("list", users);
		
		return "queryUser";
	}
	
	@RequestMapping("/toModifyPage")
	public String toModifyPage(Long id, Model model){
		
		User user = this.userDao.selectUserById(id);
		model.addAttribute("user", user);
		
		return "modifyUser";
	}
	
	@RequestMapping("/modifyUser")
	public String modifyUser(User user){
		
		this.userDao.update(user);
		
		return "redirect:/queryUser";
	}
	
	@RequestMapping("/delete")
	public String delete(Long id){
		
		this.userDao.deleteByUserId(id);
		
		return "redirect:/queryUser";
	}
	
	@RequestMapping(value={"/", "/index", "/default"})
	public String showIndex(){
		return "index";
	}
	
}
