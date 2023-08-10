package com.mrodrigochaves.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mrodrigochaves.backend.model.Users;
import com.mrodrigochaves.backend.repository.UsersRepository; 

@Service
public class UsersService {

    private final UsersRepository usersRepository; 

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getAll() {
        return usersRepository.findAll(); 
    }

    public Users createUser(Users users) {
        return usersRepository.save(users);
    }
}
