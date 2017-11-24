package com.lcsc.dao;

import java.util.List;

import com.lcsc.pojo.User;

public interface UserDao {
	
	void insert(User user);
	void deleteUserById(Integer id);
	User selectUser(User user);	//可以检查登陆和查找用户
	List<User> queryAll();
}
