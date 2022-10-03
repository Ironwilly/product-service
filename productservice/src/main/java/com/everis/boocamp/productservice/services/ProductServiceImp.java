package com.everis.boocamp.productservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.everis.boocamp.productservice.dto.ProductDTO;

@Service
public class ProductServiceImp implements ProductServiceI {
	
	@Value("$(server.port)")
	private String port;

	
	
	@Autowired
	private ProductDTO productDTO;
	
	@Override
	public ProductDTO getProductId(Long id) {
		productDTO.setProductId(id);
		productDTO.setChannel("GET");
		return productDTO;
	}



}
