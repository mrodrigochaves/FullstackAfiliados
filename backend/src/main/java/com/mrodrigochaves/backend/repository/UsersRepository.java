package com.mrodrigochaves.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrodrigochaves.backend.model.Users;

public interface UsersRepository extends JpaRepository<Users, String> {
    Users findByUsersName(String username);
}
