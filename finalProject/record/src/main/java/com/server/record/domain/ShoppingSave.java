package com.server.record.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShoppingSave {

    @Id
    @Column(name="shopping_code")
    private int shoppingCode;

    @Column(name="prduct_code")
    private int productCode;

    @Column(name="Used_prduct_code")
    private int usedProductCode;

    @Column(name="user_code")
    private int userCode;

}