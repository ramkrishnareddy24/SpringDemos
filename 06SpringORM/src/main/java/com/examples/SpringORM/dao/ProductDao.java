package com.examples.SpringORM.dao;

import java.util.List;

import com.examples.SpringORM.entity.Product;

public interface ProductDao {
	int create(Product product);
	void update(Product product);
	void delete(Product product);
	Product find(int id);
	List<Product> findAll();
}
