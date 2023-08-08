package com.mrodrigochaves.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrodrigochaves.backend.model.Transaction;
import com.mrodrigochaves.backend.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService){
        this.usersService = usersService;
    }
    
    @GetMapping("/users/all")
    public List<Transaction> getAllUsers(){
        return usersService.getAll();
            
    }
}
