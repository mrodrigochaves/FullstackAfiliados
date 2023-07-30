package com.mrodrigochaves.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrodrigochaves.backend.model.Affiliate;

public interface AffiliateRepository extends JpaRepository<Affiliate, Long> {
    
}
