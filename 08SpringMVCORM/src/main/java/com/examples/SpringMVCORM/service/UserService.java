package com.examples.SpringMVCORM.service;

import java.util.List;

import com.examples.SpringMVCORM.entity.User;
import com.examples.SpringMVCORM.exception.UserAlreadyExistsException;

public interface UserService {
	int save(User user) throws UserAlreadyExistsException;
	List<User> getUsers();
}
