package com.sxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sxt.mapper.UsersMapper;
import com.sxt.pojo.Users;
import com.sxt.service.UsersService;
@Service
public class UserServiceImpl implements UsersService{
	//表示自动注入,通过Byname
	@Resource
	private UsersMapper usersMapper;
	@Override
	public List<Users> showAll() {
		
		return usersMapper.selAll();
	}
	
}
