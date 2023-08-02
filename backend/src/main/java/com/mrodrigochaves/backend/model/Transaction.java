package com.mrodrigochaves.backend.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "type")
    private TransactionType typeId;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "product")
    private String product;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "seller")
    private String seller;
    

}