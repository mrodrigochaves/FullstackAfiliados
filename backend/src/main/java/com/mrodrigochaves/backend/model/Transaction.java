package com.mrodrigochaves.backend.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Transaction {

    @Column(name = "id")
    Long id;

    @Column(name = "creator_id")
    Long creatorId;

    @Column(name = "affiliate_id")
    Long affiliateId;

    @Column(name = "product_id")
    Long productId;

    @Column(name = "quantity")
    Integer quantity;

    @Column(name = "price")
    BigDecimal price;

    @Column(name = "commission")
    BigDecimal commission;

    @Column(name = "status")
    LocalDateTime createdAt;

    @Column(name = "status")
    LocalDateTime updatedAt;

    
}