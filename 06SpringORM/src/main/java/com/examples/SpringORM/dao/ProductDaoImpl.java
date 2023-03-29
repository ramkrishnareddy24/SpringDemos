package com.examples.SpringORM.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.examples.SpringORM.entity.Product;

@Component("productdao")
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		
		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

	@Override
	@Transactional
	public Product find(int id) {
		return hibernateTemplate.get(Product.class,id);
	}

	@Override
	@Transactional
	public List<Product> findAll() {
		return hibernateTemplate.loadAll(Product.class);
	}

	

}
