package com.eleven.ecommerce.product_service.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eleven.ecommerce.product_service.DTO.ProductDTO;
import com.eleven.ecommerce.product_service.entity.Product;
import com.eleven.ecommerce.product_service.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public void createProduct(ProductDTO productDTO) {
		Product product = Product.builder()
				.name(productDTO.getName())
				.id(productDTO.getId())
				.description(productDTO.getDescription())
				.price(productDTO.getPrice())
				.build();
		
		productRepository.save(product);
		
	}
	
	public ProductDTO getProduct(Long id) {
		Product product = productRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Not found"));
		 return ProductDTO.builder()
				 .name(product.getName())
				 .id(product.getId())
				 .description(product.getDescription())
				 .price(product.getPrice())
				 .build();
		
				
	}

	

}
