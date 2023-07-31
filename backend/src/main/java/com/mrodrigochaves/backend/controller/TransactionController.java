package com.mrodrigochaves.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrodrigochaves.backend.model.Transaction;
import com.mrodrigochaves.backend.repository.TransactionRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor

public class TransactionController {

    private TransactionRepository transactionRepository;

    @GetMapping
    public List<Transaction> list(){
        return transactionRepository.findAll();
    }
    
}
