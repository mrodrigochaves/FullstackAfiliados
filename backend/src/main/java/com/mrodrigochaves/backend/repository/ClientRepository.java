package com.mrodrigochaves.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrodrigochaves.backend.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
