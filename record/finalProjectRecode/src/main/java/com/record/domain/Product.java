package com.record.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Product {

	@Id
	@Column(name="product_code")
	private int productCode;
	
	@Column(name="product_type")
	private String productType;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_price")
	private String productPrice;
	
	@Column(name="product_img")
	private String productImg;
	
	@Column(name="product_explanation")
	private String productExplanation;
	
	@Column(name="product_quantity")
	private int productQuantity;
	
}
