package com.mrodrigochaves.backend.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mrodrigochaves.backend.model.Transaction;
import com.mrodrigochaves.backend.model.TransactionType;
import com.mrodrigochaves.backend.repository.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> processFile(MultipartFile file) throws IOException {
        List<Transaction> transactions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Transaction transaction = new Transaction();
                
                Long typeId = Long.parseLong(values[0]);
                transaction.setTypeId(new TransactionType(typeId, values[1], values[2], values[3]));
                
                transaction.setDate(LocalDateTime.parse(values[4], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                transaction.setProduct(values[5]);
                transaction.setPrice(new BigDecimal(values[6]));
                transaction.setSeller(values[7]);
                transactions.add(transaction);
            }
        }
        return transactions;
    }
    

    public void saveTransactions(List<Transaction> transactions) {
        transactionRepository.saveAll(transactions);
    }
}
