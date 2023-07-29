package com.mrodrigochaves.backend.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TransactionDTO {

    private Long id;

    private String name;

    private Integer quantity;

    private BigDecimal price;

    private BigDecimal commission;

    private LocalDateTime createdAt;
    
    private LocalDateTime updatedAt;

}
