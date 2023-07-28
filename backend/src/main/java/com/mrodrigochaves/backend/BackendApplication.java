package com.mrodrigochaves.backend;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mrodrigochaves.backend.repository.TransactionRepository;
import com.mrodrigochaves.backend.model.Transaction;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2

public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase( TransactionRepository transactionRepository){
		return args	->	{
			Transaction transaction = new Transaction();
			transaction.setCreatorId(1L);
			transaction.setAffiliateId(1L);
			transaction.setProductId(1L);
			transaction.setQuantity(1);
			transaction.setPrice(new BigDecimal(1));
			transaction.setCommission(new BigDecimal(1));
			transaction.setCreatedAt(LocalDateTime.now());
			transaction.setUpdatedAt(LocalDateTime.now());
			transactionRepository.save(transaction);
		};
		
	}

}
