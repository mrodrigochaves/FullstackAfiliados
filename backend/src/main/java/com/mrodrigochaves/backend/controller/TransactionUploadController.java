package com.mrodrigochaves.backend.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mrodrigochaves.backend.model.Transaction;
import com.mrodrigochaves.backend.repository.TransactionRepository;
import com.mrodrigochaves.backend.service.TransactionService;

@Controller
// CORS configuration
@CrossOrigin(origins = "http://localhost:8080")
// Path
@RequestMapping("/api")
public class TransactionUploadController {

    private final TransactionRepository transactionRepository;
    private final TransactionService transactionService;

    @Autowired
    public TransactionUploadController(TransactionRepository transactionRepository, TransactionService transactionService) {
        this.transactionRepository = transactionRepository;
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<Transaction> list() {
        return transactionRepository.findAll();
    }

    @GetMapping("/upload")
    public String showUploadForm() {
        return "upload-form";
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {
        try {
            List<Transaction> transactions = transactionService.processFile(file);
            transactionService.saveTransactions(transactions);
            return "redirect:/upload?success";
        } catch (IOException e) {
            return "redirect:/upload?error";
        }
    }
}
