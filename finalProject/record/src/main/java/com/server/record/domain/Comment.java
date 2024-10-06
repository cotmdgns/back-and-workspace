package com.server.record.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity @Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment {

    @Id
    @Column(name="comment_code")
    private int commentCode;

    @Column(name="comment_text")
    private String commentText;

    @Column(name="comment_created")
    private LocalDate commentCreated;

    @Column(name="user_code")
    private int userCode;

    @Column(name="product_code")
    private int productCode;

}