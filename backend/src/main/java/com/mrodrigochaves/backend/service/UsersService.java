package com.mrodrigochaves.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrodrigochaves.backend.model.Transaction;
import com.mrodrigochaves.backend.repository.TransactionRepository; 

@Service
public class UsersService {

    private final TransactionRepository transactionRepository; 

    @Autowired
    public UsersService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> getAll() {
        return transactionRepository.findAll(); 
    }
}
