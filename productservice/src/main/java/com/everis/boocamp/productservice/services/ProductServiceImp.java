package com.everis.boocamp.productservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.everis.boocamp.productservice.dto.ProductDTO;

@Service
public class ProductServiceImp implements ProductServiceI {
	
	@Value("$(server.port)")
	private String port;

	
	@Autowired
	Environment environment;
	

	
	@Override
	public ProductDTO getProductId(Long id) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductId(id);
		productDTO.setChannel("GET");
		port = environment.getProperty("local.server.port");
		
		
		return productDTO;
	}



	@Override
	public ProductDTO postProductId(Long id) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductId(id);
		productDTO.setChannel("Post");
		port = environment.getProperty("local.server.port");
	
		
		return productDTO;
	}



}
