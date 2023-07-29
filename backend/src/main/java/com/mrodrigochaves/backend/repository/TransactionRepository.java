package com.mrodrigochaves.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrodrigochaves.backend.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

    List<Transaction> listAll();
    
}
