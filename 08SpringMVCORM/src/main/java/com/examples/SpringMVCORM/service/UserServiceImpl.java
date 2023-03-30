package com.examples.SpringMVCORM.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.SpringMVCORM.dao.UserDao;
import com.examples.SpringMVCORM.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userdao;
	
	@Override
	@Transactional
	public int save(User user) {
		return userdao.create(user);
	}

}
