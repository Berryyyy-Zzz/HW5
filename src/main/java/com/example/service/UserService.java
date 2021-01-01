package com.example.service;


import com.example.entity.User;

public interface UserService {
	User login(User user) throws Exception;
	int register(User user) throws Exception;
	User findUser(int id)throws Exception;
}
