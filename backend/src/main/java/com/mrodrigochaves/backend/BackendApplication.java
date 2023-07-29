package com.mrodrigochaves.backend;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mrodrigochaves.backend.repository.TransactionRepository;
import com.mrodrigochaves.backend.model.Transaction;



@SpringBootApplication


public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase( TransactionRepository transactionRepository){
		return args	->	{
			transactionRepository.deleteAll();

			Transaction transaction = new Transaction();

			transaction.setName("Jose");
			transaction.setQuantity(1);
			transaction.setPrice(new BigDecimal(1));
			transaction.setCommission(new BigDecimal(1));
			transaction.setCreatedAt(LocalDateTime.now());
			transaction.setUpdatedAt(LocalDateTime.now());

			transactionRepository.save(transaction);
		};
		
	}

}
