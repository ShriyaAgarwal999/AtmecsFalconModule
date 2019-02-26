package org.atmecs.falcongetmethods.controllers;

import java.util.List;

import org.atmecs.falcongetmethods.models.ProductModel;
import org.atmecs.falcongetmethods.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/getProducts")
	public List<ProductModel> getProducts()
	{
		return productRepository.findAll();
	}

}
