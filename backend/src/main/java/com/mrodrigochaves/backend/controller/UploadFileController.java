package com.mrodrigochaves.backend.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mrodrigochaves.backend.model.Transaction;
import com.mrodrigochaves.backend.service.TransactionService;

@Controller
public class UploadFileController {
    
    @Autowired
    private TransactionService transactionService;

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
