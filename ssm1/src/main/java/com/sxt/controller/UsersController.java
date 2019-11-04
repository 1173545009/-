package com.sxt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sxt.pojo.Users;
import com.sxt.service.UsersService;

@Controller
public class UsersController {
	@Resource
	private UsersService usersServiceImpl;
	@RequestMapping("show")
	public String show(Model model){
		//model,向前台传递数据,可以是对象,也可是list,通过el表达式获取		
		 List<Users> users = usersServiceImpl.showAll();
		model.addAttribute("list",users);
		System.out.println(users);
		return "index.jsp";
	}
}
