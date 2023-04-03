package com.example.SpringbootREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SpringbootREST.entity.Product;
import com.example.SpringbootREST.repository.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProductWebController {
	
	@Autowired
	private ProductRepository repo;
	
	@GetMapping
	public String getProducts(ModelMap model) {
		model.addAttribute("products",repo.findAll());
		return "products";
	}
	
	@PostMapping
	public String addProduct(@ModelAttribute("product") Product product, ModelMap model) {
		repo.save(product);
		model.addAttribute("products",repo.findAll());
		return "products";
	}
}
