package com.eleven.ecommerce.product_service.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eleven.ecommerce.product_service.entity.Product;
import com.eleven.ecommerce.product_service.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Optional<Product> getProduct(Long id) {
		return productRepository.findById(id);
	}

}
