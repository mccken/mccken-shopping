package com.lcsc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcsc.dao.UserDao;
import com.lcsc.pojo.User;
import com.lcsc.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao; 
	
	public void addUser(User user) {
		userDao.insert(user);
	}

	public void removeUser(Integer id) {
		userDao.deleteUserById(id);
	}

	public User findUser(User user) {
		User findUser = userDao.selectUser(user);
		return findUser;
	}

	public List<User> queryAll() {
		List<User> list = userDao.queryAll();
		return list;
	}

}
