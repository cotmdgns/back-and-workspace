package com.record.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder
public class UserOrder {
	
	@Id
	@Column(name="order_code")
	private int orderCode;
	
	@Column(name="product_code")
	private int productCode;
	
	@Column(name="Used_product_code")
	private int usedProductCode;
	
	@Column(name="user_code")
	private int userCode;

}
