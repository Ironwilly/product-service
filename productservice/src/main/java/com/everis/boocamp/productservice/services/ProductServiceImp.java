package com.everis.boocamp.productservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.boocamp.productservice.dto.ProductDTO;

@Service
public class ProductServiceImp implements ProductServiceI {

	@Autowired
	private ProductDTO productDTO;
	
	@Override
	public Integer getProductId(int id) {
		
		return productDTO.getProductId();
	}

	@Override
	public String getChannel(String channel) {
		
		return productDTO.getChannel();
	}

}
