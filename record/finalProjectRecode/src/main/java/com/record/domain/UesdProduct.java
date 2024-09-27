package com.record.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder
public class UesdProduct {
	
	@Id
	@Column(name="Used_product_code")
	private int usedProductCode;
	
	@Column(name="Used_product_name")
	private int usedProductName;
	
	@Column(name="Used_product_user_code")
	private int usedProductUserCode;
	
	@Column(name="Used_product_price")
	private int usedProductPrice;
	
	@Column(name="Used_product_img")
	private int usedProductImg;
	
	@Column(name="Used_product_explanation")
	private int usedProductExplanation;
}
