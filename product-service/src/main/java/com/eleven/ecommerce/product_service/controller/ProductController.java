package com.eleven.ecommerce.product_service.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.eleven.ecommerce.product_service.DTO.ProductDTO;
import com.eleven.ecommerce.product_service.entity.Product;
import com.eleven.ecommerce.product_service.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public void createProduct(@RequestBody ProductDTO productDTO) {
		productService.createProduct(productDTO);
	}
	
	@GetMapping("/{id}")
	public ProductDTO getProduct(@PathVariable Long id) {
		return productService.getProduct(id);	
	}

}
