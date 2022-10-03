package com.everis.boocamp.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.boocamp.productservice.dto.ProductDTO;
import com.everis.boocamp.productservice.services.ProductServiceI;

@RestController
@RequestMapping("/microservicio")
public class ProductController {

	
	
	private ProductServiceI productServiceI;
	
	
	
	public ProductController(ProductServiceI productServiceI) {
		this.productServiceI = productServiceI;
	}



	@GetMapping("{id}*")
	public ProductDTO getProduct(@PathVariable Long id) {
		return productServiceI.getProductId(id);
	}
	
	
	
	
	

}
