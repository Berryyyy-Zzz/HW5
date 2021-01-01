package com.example.mapper;

import com.example.entity.User;

public interface UserMapper {
	User login(User user) throws Exception;
	int register(User user) throws Exception;
	User findUser(int id)throws Exception;
}
