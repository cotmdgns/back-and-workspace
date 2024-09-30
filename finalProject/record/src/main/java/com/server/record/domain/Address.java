package com.server.record.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Address {

    @Id
    @Column(name="user_code")
    private int userCode;

    @Column(name="user_zip")
    private String userZip;

    @Column(name="user_address_detail")
    private String userAddressDetail;

    @Column(name="user_phone")
    private String userPhone;

    @Column(name="user_details")
    private String userDetails;

}
