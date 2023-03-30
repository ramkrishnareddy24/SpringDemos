package com.examples.SpringMVCORM.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.SpringMVCORM.dao.UserDao;
import com.examples.SpringMVCORM.entity.User;
import com.examples.SpringMVCORM.exception.UserAlreadyExistsException;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userdao;
	
	@Override
	@Transactional
	public int save(User user) throws UserAlreadyExistsException {
		if(userdao.findUser(user.getEmail()) != null) {
			throw new UserAlreadyExistsException(user.getEmail());
		}
		return userdao.create(user);
	}

	@Override
	public List<User> getUsers() {
		return userdao.findUsers();
	}

}
