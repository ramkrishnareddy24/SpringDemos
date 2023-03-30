package com.examples.SpringMVCORM.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.examples.SpringMVCORM.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public int create(User user) {
		int result = (int) hibernateTemplate.save(user);
		return result;
	}

}
