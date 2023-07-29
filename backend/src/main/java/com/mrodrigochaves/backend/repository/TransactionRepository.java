package com.mrodrigochaves.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrodrigochaves.backend.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{


    
}
