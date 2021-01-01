package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
@Service(value = "UserService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User login(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.login(user);
	}

	@Override
	public int register(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.register(user);
	}

	@Override
	public User findUser(int id) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.findUser(id);
	}

}
