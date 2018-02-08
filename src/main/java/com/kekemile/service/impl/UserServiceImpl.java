package com.kekemile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.kekemile.dao.UserMapper;
import com.kekemile.po.User;
import com.kekemile.service.UserService;

public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserMapper userMapper;

	public User selectUserById(int id) {

		return userMapper.selectUserById(id);
	}

}
