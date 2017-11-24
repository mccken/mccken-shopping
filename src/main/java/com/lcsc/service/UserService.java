package com.lcsc.service;

import java.util.List;

import com.lcsc.pojo.User;


public interface UserService {
	void addUser(User user);
	void removeUser(Integer id);
	User findUser(User user);
	List<User> queryAll();
}
