package com.interview.interviewassessment.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    private long productId;
    private String productName;
    @Column(nullable = true)
    private byte[] productImage;
    private BigDecimal productPrice;
    private String productType;
    private BigDecimal purchaseCount;
    private String productDescription;
    private String customerReview;
    private String specifications;
    @Column(nullable = true)
    private String sortBy;



}
