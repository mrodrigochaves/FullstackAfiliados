package com.mrodrigochaves.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrodrigochaves.backend.model.Creator;

public interface CreatorRepository extends JpaRepository<Creator, Long> {
    
}
