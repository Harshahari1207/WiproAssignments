package com.wipro.service;

import com.wipro.model.Login;
import com.wipro.model.User;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.dao.*;
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserDao userDao;

	public int register(User user) {
		// TODO Auto-generated method stub
		return userDao.register(user);
	}

	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return userDao.validateUser(login);
	}

}
