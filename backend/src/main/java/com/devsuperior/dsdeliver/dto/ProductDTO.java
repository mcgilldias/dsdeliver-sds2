package com.devsuperior.dsdeliver.dto;

import java.io.Serializable;

import com.devsuperior.dsdeliver.entities.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String name;
	private Double price;
	private String description;
	private String imageUri;

	public ProductDTO(Product product) {
		id = product.getId();
		name = product.getName();
		price = product.getPrice();
		description = product.getDescription();
		imageUri = product.getImageUri();
	}

}
