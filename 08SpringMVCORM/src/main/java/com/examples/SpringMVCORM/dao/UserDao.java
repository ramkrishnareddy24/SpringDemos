package com.examples.SpringMVCORM.dao;

import java.util.List;

import com.examples.SpringMVCORM.entity.User;

public interface UserDao {
	int create(User user); 
	List<User> findUsers();
	User findUser(String email);
}
