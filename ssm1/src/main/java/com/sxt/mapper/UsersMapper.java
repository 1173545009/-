package com.sxt.mapper;

import java.util.List;

import com.sxt.pojo.Users;

public interface UsersMapper {
	//使用注解或配置文件两种方式
	List<Users> selAll();
	
}
