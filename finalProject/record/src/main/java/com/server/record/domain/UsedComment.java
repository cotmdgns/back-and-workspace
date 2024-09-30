package com.server.record.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsedComment {

    @Id
    @Column(name="Used_comment_code")
    private int usedCommentCode;

    @Column(name="Used_comment_text")
    private int usedCommentText;

    @Column(name="Used_comment_created")
    private LocalDate usedCommentCreated;

    @Column(name="user_code")
    private int userCode;

    @Column(name="Used_product_code")
    private int usedProductCode;
}
